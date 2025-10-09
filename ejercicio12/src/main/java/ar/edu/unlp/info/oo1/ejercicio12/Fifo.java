package ar.edu.unlp.info.oo1.ejercicio12;


public class Fifo extends JobScheduler {

	public Fifo() {
		super();
		this.strategy = "FIFO";
	}
	
    public JobDescription nextJob() {
        return jobs.get(0);
    }

}

