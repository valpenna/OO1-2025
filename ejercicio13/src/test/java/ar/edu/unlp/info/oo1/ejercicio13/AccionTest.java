package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccionTest {
	private Inversion invEnAccion1;
	private Inversion invEnAccion2;
	
	@BeforeEach
	void setUp() throws Exception {
		invEnAccion1 = new Accion("Accion1", 100, 1);
		invEnAccion2 = new Accion("Accion2", 50, 3);
	}
	
	@Test
	public void testCalcularValorActual() {
		assertEquals(100, invEnAccion1.calcularValorActual());
		assertEquals(150, invEnAccion2.calcularValorActual());
	}

}
