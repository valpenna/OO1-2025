package ar.edu.unlp.info.oo1.ejercicio7;

public class Circulo extends Figura{
	private double radio;


	public double getDiametro() {
		return radio*2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return Math.PI * radio * 2;
	}
	
	public double getArea() {
		return Math.PI * radio * radio;
	}
	
}