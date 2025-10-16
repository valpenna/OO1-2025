package ar.edu.unlp.info.oo1.ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversion{
	private double interes;
	private LocalDate fechaConstitucion;
	private double montoDepositado;
	
	public PlazoFijo(double interes, double montoDepositado) {
		this.interes = interes;
		this.fechaConstitucion = LocalDate.now();
		this.montoDepositado = montoDepositado;
	}
	
	public double calcularValorActual() {
		int dias = (int) ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now());
		return this.montoDepositado+((interes/100 * montoDepositado) + dias);
	}

	
	public double getInteresDiario() {
		return this.interes/100 * montoDepositado;
	}
	
	public double getMontoDepositado() {
		return this.montoDepositado;
	}
}
