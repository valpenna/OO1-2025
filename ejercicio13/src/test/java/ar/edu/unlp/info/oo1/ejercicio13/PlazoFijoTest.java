package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlazoFijoTest {
	private Inversion plazoFijo1;
	private Inversion plazoFijo2;
	//como hago para testear bien el rango de fechas?
	
	@BeforeEach
	void setUp() throws Exception {
		plazoFijo1 = new PlazoFijo(10, 100);
		plazoFijo2 = new PlazoFijo(0, 100);
	}
	
	@Test
	public void testCalcularValorActual() {
		assertEquals(110, plazoFijo1.calcularValorActual());
		assertEquals(100, plazoFijo2.calcularValorActual());
	}
}
