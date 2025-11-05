package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public class Grupal extends Plan{
	
	public Grupal(int cantMaxIp) {
		super();
		this.cantMaxIp = cantMaxIp;
	}
	
	
	public double precioBase() {
		return 800 * cantMaxIp;
	}
	
	public double montoPorPenalizaciones(Cliente cli, LocalDate fInicial, LocalDate fFinal) {
			DateLapse periodo = new DateLapse(fInicial, fFinal);
			if(cli.antiguedadEnAnios() < 10) {
				int ipsDistintas = (int) this.actividades.stream()
						.filter(a -> a.estaEnRango(periodo))
						.map(a -> a.getIpAcceso()).distinct().count();
				if(ipsDistintas > cantMaxIp) return (ipsDistintas - cantMaxIp) * 500;
			}
			return 0;
	}
}
