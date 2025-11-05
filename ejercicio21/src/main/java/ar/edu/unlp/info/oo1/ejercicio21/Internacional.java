package ar.edu.unlp.info.oo1.ejercicio21;

public class Internacional extends Envio{
	private boolean envioRapido;
	
	public Internacional(String dirOrigen, String dirDestino, double pesoEnGramos, boolean envioRapido) {
		super(dirOrigen, dirDestino, pesoEnGramos);
		this.envioRapido = envioRapido;
	}

	
	public double calcularCosto() {
		double costo = 5000;
		if (pesoEnGramos <= 1000) costo += 10 * pesoEnGramos;
		else costo += 12 * pesoEnGramos;

		if (envioRapido) costo += 800;

		return costo;
	}

}
/*
	PARTICIONES EQUIVALENTES
Dado el metodo calcularCosto() se comporta igual para los siguientes intervalos
.De [0,1] kg -> todos los casos me devuelven el costo incrementado en 10*peso.
.De [0,1] kg -> si el envio rapido esta activo se incrementan 800 y sera igual para todas las partes
.De (1,infinito) -> todos los casos me devuelven el costo incrementado en 12*peso.
.De (1,infinito) -> si el envio rapido esta activo se incrementan 800 y sera igual para todas las partes


	VALORES BORDE
en 100 -> limite inferior 99, limite superior 101
en 500 -> limite inferior 499, limite superior 501

*/