package ar.edu.unlp.info.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InternacionalTest {
	private Envio envioInternacionalLiviano;
	private Envio envioInternacionalPesado;
	private Envio envioInternacionalLivianoRapido;
	private Envio envioInternacionalPesadoRapido;
	private Envio envioInternacionalCasoLimite1;
	private Envio envioInternacionalCasoLimite2;


	@BeforeEach
	void setUp() throws Exception {
		envioInternacionalLiviano = new Internacional("Argentina", "Paraguay", 200, false);
		envioInternacionalPesado = new Internacional("Argentina", "Paraguay", 1500, false);
		envioInternacionalLivianoRapido = new Internacional("Argentina", "Paraguay", 200, true);
		envioInternacionalPesadoRapido = new Internacional("Argentina", "Paraguay", 1500, true);
		envioInternacionalCasoLimite1 = new Internacional("Argentina", "Paraguay", 999, false);
		envioInternacionalCasoLimite2 = new Internacional("Argentina", "Paraguay", 1001, false);
	}
	
	@Test
	public void calcularCostoTest() {
		assertEquals(7000, envioInternacionalLiviano.calcularCosto());
		assertEquals(23000, envioInternacionalPesado.calcularCosto());
		assertEquals(7800, envioInternacionalLivianoRapido.calcularCosto());
		assertEquals(23800, envioInternacionalPesadoRapido.calcularCosto());
		
		assertEquals(14990, envioInternacionalCasoLimite1.calcularCosto());
		assertEquals(17012, envioInternacionalCasoLimite2.calcularCosto());
		
		
	}

}
