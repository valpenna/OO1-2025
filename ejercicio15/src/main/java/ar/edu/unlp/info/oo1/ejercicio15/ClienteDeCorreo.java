package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	public void recibir(Email email) {
		this.inbox.recibir(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream()
				.map(c->c.buscarEnCarpeta(texto))
				.filter(Objects::nonNull)
				.findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(c->c.espacioOcupadoCarpeta())
				.sum();
	}
	
	
}
