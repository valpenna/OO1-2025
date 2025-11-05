package ar.edu.unlp.info.oo1.ejercicio21;

public class Interurbano extends Envio{
	private int distanciaEnKm;
	
	public Interurbano(String dirOrigen, String dirDestino, double pesoEnGramos, int distanciaEnKm) {
		super(dirOrigen, dirDestino, pesoEnGramos);
		this.distanciaEnKm = distanciaEnKm;
	}

	@Override
	public double calcularCosto() { //preguntar si modelados con if esta bien
		if(distanciaEnKm < 100) return 20*pesoEnGramos;
		else if(distanciaEnKm <= 500) return 25*pesoEnGramos;
		else return 30*pesoEnGramos;
	}

}

/*
		PARTICIONES EQUIVALENTES
	Dado el metodo calcularCosto() se comporta igual para los siguientes intervalos
	.De [0,100) -> todos los casos me devuelven 20*peso.
	.De [100,500] -> todos los casos me devuelven 25*peso.
	.De (500, infinito) -> todos los casos me devuelven 30*peso.
		VALORES BORDE
	en 100 -> limite inferior 99, limite superior 101
	en 500 -> limite inferior 499, limite superior 501

*/