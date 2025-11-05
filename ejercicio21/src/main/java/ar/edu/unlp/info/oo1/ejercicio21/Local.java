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

/*
PARTICIONES EQUIVALENTES
Dado el metodo calcularCosto() se comporta igual para las siguientes partes
.Para las que no tienen envio rapido
.Para las que tienen envio rapido

VALORES BORDE
No son explicitos

*/