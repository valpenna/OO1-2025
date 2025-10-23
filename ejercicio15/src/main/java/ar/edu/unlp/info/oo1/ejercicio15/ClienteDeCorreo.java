package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	public void recibir(Email email) {
		this.inbox.recibir(email);
	}
	
/*	public Email buscar(Email email) {
		return this.carpetas.stream()
				.filter(c->c.buscarEnCarpeta(texto))
				.collect();
	}*/
	
	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(c->c.espacioOcupadoCarpeta())
				.sum();
	}
	
	
}
