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
	
	public Email buscar(String texto) {
	    // Primero busca en el inbox
	    Email encontrado = this.inbox.buscarEnCarpeta(texto);
	    if (encontrado != null)
	        return encontrado;
	    
	    // Si no está en el inbox, busca en las demás carpetas
	    return this.carpetas.stream()
	            .map(c -> c.buscarEnCarpeta(texto))
	            .filter(e -> e != null)
	            .findFirst()
	            .orElse(null);
	}

	public int espacioOcupado() {
		return this.carpetas.stream()
				.mapToInt(c->c.espacioOcupadoCarpeta())
				.sum();
	}
	
	
}