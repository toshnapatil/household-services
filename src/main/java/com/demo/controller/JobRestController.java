package com.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Job;
import com.demo.bean.Customer;
import com.demo.service.JobService;

@RestController
public class JobRestController {
	@Autowired
	JobService jobService;
	
	@GetMapping("/jobs")//,produces="application/json")
	public List<Job> getAllUser() {
		List<Job> plist=jobService.getAllJobs();
		System.out.println("length : " +plist.size());
		return plist;
		//return "hello";
	}
	
	@GetMapping(path="jobs/{id}",produces="application/json")
	public Optional<Job> getJobById(@PathVariable("id") int id) {
		   return jobService.getJobById(id);
	}
	
	@PostMapping(path="/jobs",headers = "Accept=application/json")
	public List<Job> addJob(@RequestBody Job p){
		jobService.addJob(p);
		List<Job> plist=jobService.getAllJobs();
		return plist;
		
	}
	
	@PutMapping(path="/jobs",headers = "Accept=application/json")
	public List<Job> updateJob(@RequestBody Job p)
	{
		jobService.updateJob(p);
		List<Job> plist=jobService.getAllJobs();
		return plist;
	}
	
	@DeleteMapping("jobs/{id}")
	public List<Job> deleteUser(@PathVariable("id") int id){
		jobService.deleteById(id);
		List<Job> plist=jobService.getAllJobs();
		return plist;
	}

}
