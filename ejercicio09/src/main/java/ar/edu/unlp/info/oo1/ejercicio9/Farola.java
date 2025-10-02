package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean on;
	private List<Farola> neighbors;
	
	public Farola() {
		this.on = false;
		this.neighbors = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		this.neighbors.add(otraFarola);
		otraFarola.neighbors.add(this);
	}

	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.neighbors;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(this.isOff()) {
			on = true;
			List<Farola> vecinas = this.getNeighbors();
			for(Farola vecina : vecinas) {
				vecina.turnOn();
			}
		}
		
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.isOn()) {
			on = false;
			List<Farola> vecinas = this.getNeighbors();
			for(Farola vecina : vecinas) {
				vecina.turnOff();
			}
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		if(on) return true;
		else return false;
	}

	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		if(!on) return true;
		else return false;
	}

	
}

