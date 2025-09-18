package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
private double peso;
private double precioPorKilo;
private String descripcion;

public Producto(String des, double peso, double precio){
	this.peso = peso;
	this.precioPorKilo = precio;
	this.descripcion = des;
}


public double getPrecioPorKilo() {
	return precioPorKilo;
}


public void setPrecioPorKilo(double precioPorKilo) {
	this.precioPorKilo = precioPorKilo;
}


public void setPeso(double peso) {
	this.peso = peso;
}


public double getPeso() {
return this.peso;
}

public double getPrecio() {
return this.precioPorKilo * this.peso;
}

public void setDescripcion(String descr){
this.descripcion = descr;
}

public String getDescripcion() {
return this.descripcion;
}
}