package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public interface PoliticaDeCancelacion {
	public double montoDevuelto(Reserva reserva, LocalDate fechaCancelacion);
}
