package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> getAdjuntos(){
		return this.adjuntos;
	}
	
	public int espacioOcupadoEmail() {
		return this.cuerpo.length()
				+ this.titulo.length()
				+ this.adjuntos.stream()
				.mapToInt(ad->ad.tamaño())
				.sum();
					
	}
	
	public boolean coincide(String texto) {
		return this.titulo.equals(texto) || this.cuerpo.equals(texto);
	}

	
	public String toString() {
		return this.titulo + this.cuerpo;
	}
}
