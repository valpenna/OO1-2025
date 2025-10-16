package ar.edu.unlp.info.oo1.ejercicio13;

public class Accion extends Inversion{
	private String nombre;
	private double valorUnitario;
	private int cantidad;
	
	public Accion(String nombre, double valorUnitario, int cantidad) {
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}
	
	public double calcularValorActual() {
		return valorUnitario * cantidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
