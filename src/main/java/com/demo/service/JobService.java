package com.demo.service;
import java.util.List;
import java.util.Optional;
import com.demo.bean.Job;

public interface JobService {
	List<Job> getAllJobs();

	Optional<Job> getJobById(int jid);

	Job updateJob(Job p);

	int  deleteById(int j_id);
	
	
	void addJob(Job p);

}


