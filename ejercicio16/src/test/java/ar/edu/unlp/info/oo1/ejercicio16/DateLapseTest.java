package ar.edu.unlp.info.oo1.ejercicio16;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dateLapse2.DateLapse2;

public class DateLapseTest {
	private DateLapse dateLapse;
	private DateLapse2 dateLapse2;
	private LocalDate desde;
	private LocalDate hasta;
	
	@BeforeEach
	void setUp() throws Exception{
		desde = LocalDate.of(2025, 10, 22);
		hasta = LocalDate.of(2025, 11, 22);
		dateLapse = new DateLapse(desde, hasta);
		dateLapse2 = new DateLapse2(desde, 31);
	}
	
	@Test
	public void sizeInDaysTest(){
		assertEquals(31, dateLapse.sizeInDays());
		assertEquals(31, dateLapse2.sizeInDays());
	}

	@Test
	public void includesDateTest() {
		LocalDate fechaEntre = LocalDate.of(2025, 10, 30);
		LocalDate fechaFuera = LocalDate.of(2025, 12, 30);

		assertTrue(dateLapse.includesDate(fechaEntre));
		assertTrue(dateLapse2.includesDate(fechaEntre));

		assertFalse(dateLapse.includesDate(fechaFuera));
		assertFalse(dateLapse2.includesDate(fechaFuera));

	}
}
