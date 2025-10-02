package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	//pueden extraer si el saldo es insuficiente. no debe superar cierto limite por debajo de ese sueldo
	public boolean puedeExtraer(double monto) {
		return monto <= (this.getSaldo() + this.descubierto);
	}
	//cuanbdo se abre una su limite descubierto es 0;
	
	
	public CuentaCorriente() {
		descubierto = 0;
	}
	
	public double getDescubierto() {
		return this.descubierto;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
}
