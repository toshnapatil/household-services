package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.bean.Job;
import com.demo.dao.JobDao;

@Service
public class JobServiceImpl implements JobService {
	@Autowired
	JobDao jobDao;

   
	public List<Job> getAllJobs() {
		return jobDao.findAll();		
	}


	public Optional<Job> getJobById(int jid) {
		return jobDao.findById(jid);
	}

	public Job updateJob(Job p) {
		return  jobDao.save(p);
		//return 1;
		
	}

	public int deleteById(int id) {
		Job p=new Job(id,null);
		jobDao.delete(p);
		 return 1;
	}

	public void addJob(Job p) {
		jobDao.save(p);
		
	}

	

}
