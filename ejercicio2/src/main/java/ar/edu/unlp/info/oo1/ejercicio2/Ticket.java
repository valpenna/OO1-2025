package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
private LocalDate fecha;
private int cantidadDeProductos;
private double pesoTotal;
private double precioTotal;

public Ticket(LocalDate fecha, int cant, double peso, double precio) {
	this.fecha = fecha;
	this.cantidadDeProductos = cant;
	this.pesoTotal = peso;
	this.precioTotal = precio;
}


public LocalDate getFecha() {
	return fecha;
}


public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}


public int getCantidadDeProductos() {
	return cantidadDeProductos;
}


public double getPesoTotal() {
	return pesoTotal;
}


public double getPrecioTotal() {
	return precioTotal;
}


public void setCantidadDeProductos(int cantidad) {
this.cantidadDeProductos = cantidad;
}

public void setPesoTotal(double peso) {
this.pesoTotal = peso;
}

public void setPrecioTotal(double precio) {
this.precioTotal = precio;
}

public void setDate(LocalDate fecha) {
	this.fecha = fecha;
}

public double impuesto() {
return this.precioTotal*0.21;
}

}