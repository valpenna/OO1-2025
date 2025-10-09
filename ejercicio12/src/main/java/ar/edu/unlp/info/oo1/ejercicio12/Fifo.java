package ar.edu.unlp.info.oo1.ejercicio12;


public class Fifo extends JobScheduler {

	public Fifo() {
		super();
		this.strategy = "FIFO";
	}
	
    protected JobDescription nextJob() {
        return jobs.get(0);
    }

}


