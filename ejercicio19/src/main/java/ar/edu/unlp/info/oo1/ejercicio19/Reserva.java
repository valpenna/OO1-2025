package ar.edu.unlp.info.oo1.ejercicio19;

public class Reserva {
	private DateLapse periodo;
	private Propiedad propiedad;
	
	public Reserva(Propiedad propiedad, DateLapse periodo) {
		this.periodo = periodo;
		this.propiedad = propiedad;
	}
	
	public DateLapse getPeriodo() {
		return this.periodo;
	}
	
	public double calcularPrecioReserva() {
		return this.propiedad.getPrecioPorNoche() * periodo.sizeInDays();
	}
}