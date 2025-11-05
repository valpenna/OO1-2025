package ar.edu.unlp.info.oo1.ejercicio29;

import java.util.ArrayList;
import java.util.List;

public class SesionDeJuego extends Actividad{
	private List<Item> items;
	
	public SesionDeJuego(int duracionTotal, String ipAcceso) {
		super(duracionTotal, ipAcceso);
		this.items = new ArrayList<Item>();
	}

	public double montoPorActividad() {
		if(this.duracionTotal > 360) return this.items.stream().mapToDouble(i -> i.precioFinal()).sum();
		return 0;
	}
}
