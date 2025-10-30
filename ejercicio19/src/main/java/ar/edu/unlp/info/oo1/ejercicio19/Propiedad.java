package ar.edu.unlp.info.oo1.ejercicio19;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Propiedad {
	private String direccion;
	private String nombreDescriptivo;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	
	public Propiedad(String direccion, String nombre, double precioPorNoche, Usuario propietario) {
		this.direccion = direccion;
		this.nombreDescriptivo = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
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
	
	public void crearReserva(LocalDate fechaInicio, LocalDate fechaFin) {
		if(this.estaDisponible(fechaInicio, fechaFin)) {
			DateLapse periodo = new DateLapse(fechaInicio, fechaFin);
			Reserva reserva = new Reserva(this, periodo);
			this.reservas.add(reserva);
		}
	}
	
	
	public boolean cancelarReserva(Reserva reserva) {
		if(reserva.incluyeFechaHoy()) {
			return false;
		} else {
			this.reservas.remove(reserva);
			return true;
		}
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


