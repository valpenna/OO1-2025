package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int DNI;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, int DNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public double calcularIngresosPropiedades(LocalDate fIni, LocalDate fHasta) {
		return propiedades.stream()
				.mapToDouble(p->p.calcularIngresos(fIni, fHasta))
				.sum();
	}
}