package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta{
	
	//solo puede extraer y transferir cuando cuenta con fondos suficientes

	public boolean puedeExtraer(double monto) {
		return monto + monto * 0.02 <= this.getSaldo();
	}
	
	//extracciones, depositos o transferencias tienen costo adicional del 2%
	//aca tengo que hacer override de extraccion y de transferencia?
	
	@Override
	public void depositar(double monto) {
		 super.depositar(monto - monto * 0.02);
	}
	
	
	
	@Override
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto + monto *0.02);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto + monto *0.02);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
}
