package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class Individuo extends Cliente{
	private int dni;
	
	public Individuo(String nombre, String direccion, int dni) {
		super(nombre, direccion);
		this.dni = dni;
	}
	
	//override porque agrego descuento
	@Override
	public double montoAPagar(LocalDate fIni, LocalDate fFin) {
		double montoSinDesc = super.montoAPagar(fIni, fFin);
		return montoSinDesc - montoSinDesc * 0.10;
	}
}
