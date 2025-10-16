package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta destino) {
		
	}
	
	public void recibir(Email email) {
		this.emails.add(email);
	}
}
