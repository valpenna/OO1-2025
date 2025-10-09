package ar.edu.unlp.info.oo1.ejercicio12;


public class Fifo extends JobScheduler {

	public Fifo() {
		super();
		this.strategy = "FIFO";
	}
	
    public JobDescription next() {
        JobDescription nextJob = null;

    	nextJob = jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
    }

}
