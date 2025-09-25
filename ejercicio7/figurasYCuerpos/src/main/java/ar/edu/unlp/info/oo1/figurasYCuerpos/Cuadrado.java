package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado extends Figura{
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	public double getPerimetro() {
		return lado*4;
	}
	
	public double getArea() {
		return lado*lado;
	}
}
