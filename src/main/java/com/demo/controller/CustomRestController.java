package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Customer;
import com.demo.bean.ServiceProvider;
import com.demo.service.CustomerService;
@RestController
public class CustomRestController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customers")//,produces="application/json")
	public List<Customer> getAllCustomer() {
		List<Customer> plist=customerService.getAllCustomers();
		System.out.println("length : " +plist.size());
		return plist;
		//return "hello";
	}
	
	@GetMapping(path="customers/{id}",produces="application/json")
	public Optional<Customer> getCustomerById(@PathVariable("id") int id) {
		   return customerService.getCustomerById(id);
	}
	
	@PostMapping(path="/customers",headers = "Accept=application/json")
	public List<Customer> addCustomer(@RequestBody Customer p){
		customerService.addCustomer(p);
		List<Customer> plist=customerService.getAllCustomers();
		return plist;
		
	}
	
	@PutMapping(path="/customers",headers = "Accept=application/json")
	public List<Customer> updateCustomer(@RequestBody Customer p)
	{
		customerService.updateCustomer(p);
		List<Customer> plist=customerService.getAllCustomers();
		return plist;
	}
	
	@DeleteMapping("customers/{id}")
	public List<Customer> deleteCustomer(@PathVariable("id") int id){
		customerService.deleteById(id);
		List<Customer> plist=customerService.getAllCustomers();
		return plist;
	}
	
	

}
