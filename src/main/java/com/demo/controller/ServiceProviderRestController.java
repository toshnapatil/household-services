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

import com.demo.bean.ServiceProvider;
import com.demo.service.ServiceProviderService;

@RestController
public class ServiceProviderRestController {
	@Autowired
	ServiceProviderService serviceProviderService;
	
	@GetMapping("/providers")//,produces="application/json")
	public List<ServiceProvider> getAllServiceProvider() {
		List<ServiceProvider> plist=serviceProviderService.getAllServiceProviders();
		System.out.println("length : " +plist.size());
		return plist;
		//return "hello";
	}
	
	@GetMapping(path="providers/{id}",produces="application/json")
	public Optional<ServiceProvider> getServiceProviderById(@PathVariable("id") int id) {
		   return serviceProviderService.getServiceProviderById(id);
	}
	
	@PostMapping(path="/providers",headers = "Accept=application/json")
	public List<ServiceProvider> addServiceProvider(@RequestBody ServiceProvider p){
		serviceProviderService.addServiceProvider(p);
		List<ServiceProvider> plist=serviceProviderService.getAllServiceProviders();
		return plist;
		
	}
	
	@PutMapping(path="/providers",headers = "Accept=application/json")
	public List<ServiceProvider> updateServiceProvider(@RequestBody ServiceProvider p)
	{
		serviceProviderService.updateServiceProvider(p);
		List<ServiceProvider> plist=serviceProviderService.getAllServiceProviders();
		return plist;
	}
	
	@DeleteMapping("providers/{id}")
	public List<ServiceProvider> deleteServiceProvider(@PathVariable("id") int id){
		serviceProviderService.deleteById(id);
		List<ServiceProvider> plist=serviceProviderService.getAllServiceProviders();
		return plist;
	}
	
	

}
