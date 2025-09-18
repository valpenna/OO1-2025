package ar.edu.unlp.info.oo1.ejercicio2;

import java.time.LocalDate;

public class Balanza {
private int cantidadDeProductos;
private double precioTotal;
private double pesoTotal;


public int getCantidadDeProductos() {
	return cantidadDeProductos;
}

public double getPrecioTotal() {
	return precioTotal;
}


public double getPesoTotal() {
	return pesoTotal;
}


public void ponerEnCero() {
this.cantidadDeProductos = 0;
this.precioTotal = 0;
this.pesoTotal = 0;
}

public void agregarProducto(Producto prod) {
this.cantidadDeProductos++;
this.precioTotal += prod.getPrecio();
this.pesoTotal += prod.getPeso();
}

public Ticket emitirTicket() {
	return new Ticket(LocalDate.now(), this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
 }
}