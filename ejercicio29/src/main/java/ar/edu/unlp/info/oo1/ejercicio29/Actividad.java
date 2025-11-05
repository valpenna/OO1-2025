package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public abstract class Actividad {
	protected LocalDate fechaInicio;
	protected int duracionTotal;
	protected String ipAcceso;
	
	public Actividad(int duracion, String ipAcceso) {
		this.fechaInicio = LocalDate.now();
		this.duracionTotal = duracion;
		this.ipAcceso = ipAcceso;
	}
	
	
	public boolean estaEnRango(DateLapse periodo) {
		return periodo.includesDate(fechaInicio);
	}
	
	public String getIpAcceso() {
		return this.ipAcceso;
	}
	
	public abstract double montoPorActividad();
}
