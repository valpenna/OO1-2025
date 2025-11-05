package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaDeCancelacion {

	
	public double montoDevuelto(Reserva reserva, LocalDate fechaCancelacion) {
        LocalDate inicio = reserva.getPeriodo().getFrom();
        long diasAntes = ChronoUnit.DAYS.between(fechaCancelacion, inicio);

        if (diasAntes >= 7) return reserva.calcularPrecioReserva();       // 100%
        if (diasAntes >= 2) return reserva.calcularPrecioReserva() * 0.5; // 50%
        return 0;
    }

}
