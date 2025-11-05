package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private String nombre;
	private LocalDate fechaDeAlta;
	private Plan plan;
	
	public String getNombre() {
		return nombre;
	}
	
	public int antiguedadEnAnios() {
		return Period.between(fechaDeAlta, LocalDate.now()).getYears();
	}
	
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
}
