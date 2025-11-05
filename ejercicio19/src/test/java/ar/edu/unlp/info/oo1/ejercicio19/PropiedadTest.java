package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropiedadTest {
	private Propiedad propiedad;
	private Reserva reserva1;
	private LocalDate fechaIni1;
	private LocalDate fechaFin1;
	private LocalDate fechaIni2;
	private LocalDate fechaFin2;
	private LocalDate fechaIni3;
	private LocalDate fechaFin3;

	
	@BeforeEach
	void setUp() throws Exception{
		propiedad = new Propiedad("160 numero 722", "Casa", 100);
		fechaIni1 = LocalDate.of(2025, 11, 5);
		fechaFin1 = LocalDate.of(2025, 11, 10);
		reserva1 = propiedad.crearReserva(fechaIni1, fechaFin1);

		
		fechaIni2 = LocalDate.of(2025, 11, 1);
		fechaFin2 = LocalDate.of(2025, 11, 4);
		
		fechaIni3 = LocalDate.of(2025, 11, 1);
		fechaFin3 = LocalDate.of(2025, 11, 6);
		
	}
	
	@Test
	public void testEstaDisponible() {
		assertTrue(propiedad.estaDisponible(fechaIni2, fechaFin2));
		assertFalse(propiedad.estaDisponible(fechaIni3, fechaFin3)); //yo se que evaluando este caso verifico los demas por particiones equivalentes
	}
	
	@Test
	public void testCancelarReserva() {
		assertEquals(0, propiedad.cancelarReserva(reserva1));
	}
}

