package ar.edu.unlp.info.oo1.ejercicio12;


public class Lifo extends JobScheduler {
	
	public Lifo() {
		super();
		this.strategy = "LIFO";
	}
	
	public JobDescription next() {
        JobDescription nextJob = null;
        
		nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
	}
}
