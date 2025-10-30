package ar.edu.unlp.info.oo1.ejercicio21;

public class Internacional extends Envio{
	private boolean envioRapido;
	
	public Internacional(String dirOrigen, String dirDestino, double pesoEnGramos, boolean envioRapido) {
		super(dirOrigen, dirDestino, pesoEnGramos);
		this.envioRapido = envioRapido;
	}

	
	public double calcularCosto() {
		double costo = 5000;
		if (pesoEnGramos <= 1) costo += 10 * pesoEnGramos;
		else costo += 12 * pesoEnGramos;

		if (envioRapido) costo += 800;

		return costo;
	}

}
