package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return altura*caraBasal.getArea();
	}
	
	public double getSuperficieExterior() {
		return 2*caraBasal.getArea() + caraBasal.getPerimetro()*altura;
	}
	
}
