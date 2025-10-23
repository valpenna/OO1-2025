package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta destino) {
		this.emails.remove(email);
		destino.recibir(email);
	}
	
	public void recibir(Email email) {
		this.emails.add(email);
	}
	
	public Email buscarEnCarpeta(String texto) {
		return this.emails.stream()
				.filter(e->e.toString().startsWith(texto))
				.findFirst().orElse(null);
	}
	
	public int espacioOcupadoCarpeta() {
		return this.emails.stream()
				.mapToInt(e->e.espacioOcupadoEmail())
				.sum();
	}
}
