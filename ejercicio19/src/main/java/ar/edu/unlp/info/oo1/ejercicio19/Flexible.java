package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Flexible implements PoliticaDeCancelacion {

	
	public double montoDevuelto(Reserva reserva, LocalDate fechaCancelacion) {
        // Si la cancelación es antes del inicio, reembolsa todo
        if (fechaCancelacion.isBefore(reserva.getPeriodo().getFrom())) {
            return reserva.calcularPrecioReserva();
        }
        return 0; // si intenta cancelar durante o después del inicio
    }


}
