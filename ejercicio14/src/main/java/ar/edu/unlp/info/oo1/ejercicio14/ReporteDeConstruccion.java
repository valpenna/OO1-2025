package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	/*"Recibe como parámetro un nombre de material (un string, por ejemplo 'Hierro').
	 *  Retorna la suma de los volúmenes de todas las piezas hechas en ese material"
	 */
	public double volumenDeMaterial(String material) {
		return  piezas.stream()
				.filter(pieza->pieza.getMaterial() == material)
				.mapToDouble(pieza->pieza.calcularVolumen())
				.sum();
	}
	
	
	/*"Recibe como parámetro un color (un string, por ejemplo 'Rojo')."
	" Retorna la suma de las superficies externas de todas las piezas pintadas con ese color".
	*/
	public double superficieDeColor(String color) {
		return  piezas.stream()
				.filter(pieza->pieza.getColor() == color)
				.mapToDouble(pieza->pieza.calcularSuperficie())
				.sum();
	}
}
