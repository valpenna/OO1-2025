package ar.edu.unlp.info.oo1.ejercicio29;

public class ReproduccionDeVideo extends Actividad{
	private int duracionPublicidad;
	
	public ReproduccionDeVideo(int duracionTotal, String ipAcceso, int duracionPublicidad) {
		super(duracionTotal, ipAcceso);
		this.duracionPublicidad = duracionPublicidad; 
	}
	
	public double duracionReal() {
		return duracionTotal - duracionPublicidad;
	}

	public double montoPorActividad() {
		return 10 * this.duracionReal();
	}
}
