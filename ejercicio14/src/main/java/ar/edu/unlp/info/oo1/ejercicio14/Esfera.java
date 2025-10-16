package ar.edu.unlp.info.oo1.ejercicio14;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}
	
	public double calcularVolumen() {
		return 4/5 * Math.PI * Math.pow(radio,3);
	}

	
	public double calcularSuperficie() {
		return 4 * Math.PI * Math.pow(radio,2);
	}

}
