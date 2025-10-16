package ar.edu.unlp.info.oo1.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Inversor{
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double sumaInversiones() {
		return this.inversiones.stream()
				.mapToDouble(inversion -> inversion.calcularValorActual())
				.sum();
	}
	
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public void quitarInversion(Inversion inversion) {
		this.inversiones.remove(inversion);
	}
}
