package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public abstract class Envio {
	protected String dirOrigen;
	protected String dirDestino;
	protected LocalDate fechaDespacho;
	protected double pesoEnGramos;
	
	public Envio(String dirOrigen, String dirDestino, double pesoEnGramos) {
		this.dirDestino = dirDestino;
		this.dirOrigen = dirOrigen;
		this.fechaDespacho = LocalDate.now();
		this.pesoEnGramos = pesoEnGramos;
	}
	
	public abstract double calcularCosto();
	
	public LocalDate getFechaDespacho() {
		return this.fechaDespacho;
	}
}
