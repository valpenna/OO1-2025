package ar.edu.unlp.info.oo1.ejercicio21;

public class Local extends Envio{
	private boolean envioRapido;
	private double costoFijo;

	public Local(String dirOrigen, String dirDestino, double pesoEnGramos, boolean envioRapido) {
		super(dirOrigen, dirDestino, pesoEnGramos);
		this.envioRapido = envioRapido;
		this.costoFijo = 1000;
	}

	
	public double calcularCosto() {
		if(envioRapido) return costoFijo + 500;
		else return costoFijo;
	}

}
