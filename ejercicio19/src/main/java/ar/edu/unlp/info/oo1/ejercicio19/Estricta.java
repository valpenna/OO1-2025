package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Estricta implements PoliticaDeCancelacion {

	
	public double montoDevuelto(Reserva reserva, LocalDate fechaCancelacion) {
        return 0; // no importa cuándo cancele
    }

}
