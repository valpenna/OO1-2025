package ar.edu.unlp.info.oo1.ejercicio21;

public class Corporativo extends Cliente{
	private int cuit;
	
	public Corporativo(String nombre, String direccion, int cuit) {
		super(nombre, direccion);
		this.cuit = cuit;
	}

}
