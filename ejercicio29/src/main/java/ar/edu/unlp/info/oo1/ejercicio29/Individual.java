package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public class Individual extends Plan{
	private int minutosContratados;
	
	public Individual(int minutosContratados) {
		super();
		this.cantMaxIp = 1;
		this.minutosContratados = minutosContratados;
	}
	
	public double precioBase() {
		return 20 * minutosContratados;
	}
	
	public double montoPorPenalizaciones(Cliente cli, LocalDate fInicial, LocalDate fFinal) {
		DateLapse periodo = new DateLapse(fInicial, fFinal);
		int ipsDistintas = (int) this.actividades.stream()
				.filter(a -> a.estaEnRango(periodo))
				.map(a -> a.getIpAcceso()).distinct().count();
		
		if(ipsDistintas > 1) return ipsDistintas * 300;
		return 0;
	}

}
