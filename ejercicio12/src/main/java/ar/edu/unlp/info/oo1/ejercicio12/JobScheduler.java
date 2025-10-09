package ar.edu.unlp.info.oo1.ejercicio12;


import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;

    public JobScheduler() {
    	this.jobs = new ArrayList<JobDescription>();
    }
    
    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public String getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    protected abstract JobDescription nextJob();
    
    public JobDescription next() {
    	JobDescription nextJob = this.nextJob();
    	this.unschedule(nextJob);
    	return nextJob;
    };

}

