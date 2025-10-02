package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre) {
		this.identificador = nombre;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	
	public Mamifero getAbueloMaterno() {
		return (this.madre != null) ? this.madre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null) ? this.madre.getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.padre != null) ? this.padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.padre != null) ? this.padre.getMadre() : null;
	}
	
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(unMamifero == null || this.equals(unMamifero)) {
			return false;
		}
		
		if(this.padre != null) {
			if(this.padre.equals(unMamifero) || this.padre.tieneComoAncestroA(unMamifero)) {
				return true;
			}
		}
		
		if(this.madre != null) {
			if(this.madre.equals(unMamifero) || this.madre.tieneComoAncestroA(unMamifero)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	/*public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(this.padre.equals(unMamifero)) return true;
		if(this.madre.equals(unMamifero)) return true;
		if(this.getAbuelaMaterna().equals(unMamifero)) return true;
		if(this.getAbuelaPaterna().equals(unMamifero)) return true;
		if(this.getAbueloMaterno().equals(unMamifero)) return true;
		if(this.getAbueloPaterno().equals(unMamifero)) return true;
		else return false;
		
	}*/
	
	
}
