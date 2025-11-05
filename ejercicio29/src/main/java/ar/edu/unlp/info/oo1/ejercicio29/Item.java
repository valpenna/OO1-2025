package ar.edu.unlp.info.oo1.ejercicio29;

public class Item {
	private String nombre;
	private double precioUnitario;
	private int cantidad;
	
	public Item(String nombre, double precioUnitario, int cantidad) {
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}
	
	public double precioFinal() {
		return cantidad * precioUnitario;
	}
}
