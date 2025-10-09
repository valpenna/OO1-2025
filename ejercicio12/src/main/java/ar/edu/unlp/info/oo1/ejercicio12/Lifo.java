package ar.edu.unlp.info.oo1.ejercicio12;


public class Lifo extends JobScheduler {
	
	public Lifo() {
		super();
		this.strategy = "LIFO";
	}
	
	protected JobDescription nextJob() {
		return jobs.get(jobs.size()-1);
	}
}

