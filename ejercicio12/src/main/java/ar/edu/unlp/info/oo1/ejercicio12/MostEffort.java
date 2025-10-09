package ar.edu.unlp.info.oo1.ejercicio12;

public class MostEffort extends JobScheduler {

	
	public MostEffort() {
		super();
		this.strategy = "MostEffort";
	}

	protected JobDescription nextJob() {
            return jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                    .orElse(null);
	}
	
}


