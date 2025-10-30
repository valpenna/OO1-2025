package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

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
	
	public boolean coincide(DateLapse otroPeriodo) {
		return getPeriodo().overlaps(otroPeriodo);
	}
	
	public boolean incluyeFechaHoy() {
		return this.periodo.includesDate(LocalDate.now());
	}
	
	public double calcularPrecioReserva() {
		return this.propiedad.devolverPrecioPorPeriodo(this.periodo);
	}
}
