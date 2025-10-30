package ar.edu.unlp.info.oo1.ejercicio21;

public class Interurbano extends Envio{
	private int distanciaEnKm;
	
	public Interurbano(String dirOrigen, String dirDestino, double pesoEnGramos, int distanciaEnKm) {
		super(dirOrigen, dirDestino, pesoEnGramos);
		this.distanciaEnKm = distanciaEnKm;
	}

	@Override
	public double calcularCosto() { //preguntar si modelados con if esta bien
		if(distanciaEnKm <= 100) return 20*pesoEnGramos;
		else if(distanciaEnKm <= 500) return 25*pesoEnGramos;
		else return 30*pesoEnGramos;
	}

}
