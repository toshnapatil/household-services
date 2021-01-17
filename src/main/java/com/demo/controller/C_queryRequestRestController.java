package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Customer;
import com.demo.bean.Job;
import com.demo.dao.C_queryDao;
import com.demo.dao.CustomerDao;
import com.demo.dto.C_queryRequest;
import com.demo.dto.QueryperCustomer;


@RestController
public class C_queryRequestRestController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private C_queryDao c_queryDao;
	
	
	@PostMapping(path="/placeQuery",headers = "Accept=application/json")
	public Customer palceQuery(@RequestBody C_queryRequest query ) {
		return customerDao.save(query.getCustomer());
	}
	
//	@PostMapping(path="/jobs",headers = "Accept=application/json")
//	public List<Job> addJob(@RequestBody Job p){
//		jobService.addJob(p);
//		List<Job> plist=jobService.getAllJobs();
//		return plist;
//		
//	}
	
	@GetMapping("/findAllQuery")
	public List<Customer> findAllCustomer(){
		return customerDao.findAll();
	}


    @GetMapping("/getInfo")
    public List<QueryperCustomer> getJoinInformation(){
        return customerDao.getJoinInformation();
    }
	
}
