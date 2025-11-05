package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterurbanoTest {
	private Envio envioInterurbanoCerca;
	private Envio envioInterurbanoMedio;
	private Envio envioInterurbanoLejos;
//	private Envio envioInterurbanoCasoLimite1;
//	private Envio envioInterurbanoCasoLimite2;


	@BeforeEach
	void setUp() throws Exception {
		envioInterurbanoCerca = new Interurbano("Argentina", "Paraguay", 200, 10);
		envioInterurbanoMedio = new Interurbano("Argentina", "Paraguay", 200, 200);
		envioInterurbanoLejos = new Interurbano("Argentina", "Paraguay", 200, 600);

//		envioInterurbanoCasoLimite1 = new Interurbano("Argentina", "Paraguay", 200, 99);
//		envioInterurbanoCasoLimite2 = new Interurbano("Argentina", "Paraguay", 200, 100);
	}
	
	@Test
	public void calcularCostoTest() {
		assertEquals(4000, envioInterurbanoCerca.calcularCosto());
		assertEquals(5000, envioInterurbanoMedio.calcularCosto());
		assertEquals(6000, envioInterurbanoLejos.calcularCosto());

		
	}

}