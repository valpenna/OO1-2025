package ar.edu.unlp.info.oo1.ejercicio19;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Propiedad {
	private String direccion;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private PoliticaDeCancelacion politica;
	
	
	public Propiedad(String direccion, String nombre, double precioPorNoche) {
		this.direccion = direccion;
		this.nombreDescriptivo = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		this.politica = new Flexible();
	}
	
	public double getPrecioPorNoche() {
		return this.precioPorNoche;
	}
	
	public boolean estaDisponible(LocalDate fechaInicial, LocalDate fechaFinal) {
		boolean esta = false;
		if(reservas.isEmpty()) {
			esta = true;
		} else {
			DateLapse periodo = new DateLapse(fechaInicial, fechaFinal);
			esta = this.reservas.stream()
					.noneMatch(r->r.coincide(periodo));
		}
		return esta; //verificar que sea true
	}
	
	public Reserva crearReserva(LocalDate fechaInicio, LocalDate fechaFin) {
		if(this.estaDisponible(fechaInicio, fechaFin)) {
			DateLapse periodo = new DateLapse(fechaInicio, fechaFin);
			Reserva reserva = new Reserva(this, periodo);
			this.reservas.add(reserva);
			return reserva;
		}
		return null;
		
	}
	
	
	public double cancelarReserva(Reserva reserva) {
		if (!this.reservas.contains(reserva)) return 0;
	    if (reserva.incluyeFechaHoy()) return 0;
		this.reservas.remove(reserva);
		return politica.montoDevuelto(reserva, LocalDate.now());
	}
	
	public double devolverPrecioPorPeriodo(DateLapse periodo) {
		return this.precioPorNoche * periodo.sizeInDays();
	}
	
	
	public double calcularIngresos(LocalDate fechaInicio, LocalDate fechaFin) {
		DateLapse periodo = new DateLapse(fechaInicio, fechaFin);
		return 0.75 * this.reservas.stream()
				.filter(r->r.coincide(periodo))
				.mapToDouble(r->r.calcularPrecioReserva())
				.sum();
	}
}


/*	Disponibilidad de una propiedad en una fecha, reservar y cancelar reserva
 	1. Para la disponibilidad de una reserva se testea el metodo estaDisponible() el cual devuelve un booleano
 	 	PARTICIONES EQUIVALENTES
 	Siendo que estan las particiones en donde:
 	.Espero que el resultado sea true si -> no hay ninguna reserva /el periodoi solicitado de la reserva no coincide con otra,
 	.Espero que el resultado sea false si -> el periodo solicitado comienza dentro de una reserva que existe 
 											el periodo solicitado termina dentro de una reserva que existe 
 											el periodo se superpone totalmente con una reserva que existe
 										 	una reserva existente está adentro del periodo solicitado
 		VALORES BORDE 
 	Se encuentran en el dia que comienza y termina una reserva
 	.en donde un borde al comienzo es el dia anterior y el dia que comienza(incluido en la reserva).
	.en donde otro borde al final es el dia que termina(incluido en la reserva) y el dia siguiente.
	
	 	
	2. Para cancelar una reserva se testea el metodo cancelarReserva()  el cual devuelve un booleano
		PARTICIONES EQUIVALENTES
	Siendo que estan las particiones en donde:
	.Espero que el resultado sea true si -> la reserva no esta en curso / la cancelacion se realiza a mas de dos dias de iniciar la reserva
	.Espero que el resultado sea false si -> la reserva esta en curso / al momento de cancelar la reserva faltan menos de dos dias para que inicie
		VALORES BORDE
	Se encuentran en el limite entre dos dias antes de la reserva y dia anterior
	ej: la reserva es del 5 al 10, y se quiere cancelar el 3(da false) 
	

	3. Para agregar una reserva se testea el metodo agregarReserva() el cual devuelve un booleano
		PARTICIONES EQUIVALENTES
	Siendo que estan las particiones donde
	.Espero que el resultado sea true si -> el metodo estaDisponible devuelve true
	.Espero que el resultado sea false si -> el metodo estaDisponible devuelve false
	
		VALORES BORDE
	Idem estaDisponible.
 * */
