package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LocalTest {
	private Envio envioLocalLento;
	private Envio envioLocalRapido;


	@BeforeEach
	void setUp() throws Exception {
		envioLocalLento = new Local("Argentina", "Paraguay", 100, false);
		envioLocalRapido = new Local("Argentina", "Paraguay", 100, true);

	}
	
	@Test
	public void calcularCostoTest() {
		assertEquals(1000, envioLocalLento.calcularCosto());
		assertEquals(1500, envioLocalRapido.calcularCosto());
		
	}
}
