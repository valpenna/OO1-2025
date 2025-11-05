package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	public Cliente(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion =  direccion;
		this.envios = new ArrayList<Envio>();
	}
	
	public void agregarEnvio(Envio envio) {
		this.envios.add(envio);
	}
	
	public double montoAPagar(LocalDate fIni, LocalDate fFin) {
		DateLapse periodo = new DateLapse(fIni, fFin);
		return this.envios.stream()
				.filter(e -> e.estaEnRango(periodo))
				.mapToDouble(e-> e.calcularCosto())
				.sum();
	}
	
}
