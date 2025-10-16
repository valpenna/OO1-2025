package ar.edu.unlp.info.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {
	private Inversor inversor;
	private Inversion accion;
	private Inversion plazoFijo;
	
	@BeforeEach
	void setUp() throws Exception{
		inversor = new Inversor("Valentina");
		accion = new Accion("Accion1", 100, 1);
		plazoFijo = new PlazoFijo(10, 100);
		
		inversor.agregarInversion(accion);
		inversor.agregarInversion(plazoFijo);
	}
	
	@Test
	public void testSumaInversiones() {
		assertEquals(210, inversor.sumaInversiones());
	}
}
