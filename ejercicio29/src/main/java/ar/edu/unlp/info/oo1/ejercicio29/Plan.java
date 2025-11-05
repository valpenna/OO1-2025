package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Plan {
	protected int cantMaxIp;
	protected List<Actividad> actividades;
	
	public Plan() {
		this.actividades = new ArrayList<Actividad>();
	}
	
	public abstract double precioBase();
	public abstract double montoPorPenalizaciones(Cliente cli, LocalDate fInicial, LocalDate fFinal);

	
	public double montoTotalACobrar(Cliente cli, LocalDate fInicial, LocalDate fFinal) {
		return this.precioBase() + this.montoPorActividades(fInicial,fFinal) + this.montoPorPenalizaciones(cli,fInicial,fFinal);
	}
	
	public double montoPorActividades(LocalDate fInicial, LocalDate fFinal){
		DateLapse periodo = new DateLapse(fInicial, fFinal);
		return this.actividades.stream()
				.filter(a -> a.estaEnRango(periodo))
				.mapToDouble(a-> a.montoPorActividad())
				.sum();
	}
	
}
