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

import com.demo.bean.Staff;
import com.demo.service.StaffService;

@RestController
public class StaffRestController {
	@Autowired
	StaffService staffService;
	
	@GetMapping("/staffs")//,produces="application/json")
	public List<Staff> getAllServiceStaff() {
		List<Staff> plist=staffService.getAllStaffs();
		System.out.println("length : " +plist.size());
		return plist;
		//return "hello";
	}
	
	@GetMapping(path="staffs/{id}",produces="application/json")
	public Optional<Staff> getStaffById(@PathVariable("id") int id) {
		   return staffService.getStaffById(id);
	}
	
	@PostMapping(path="/staffs",headers = "Accept=application/json")
	public List<Staff> addStaff(@RequestBody Staff p){
		staffService.addStaff(p);
		List<Staff> plist=staffService.getAllStaffs();
		return plist;
		
	}
	
	@PutMapping(path="/staffs",headers = "Accept=application/json")
	public List<Staff> updateStaff(@RequestBody Staff p)
	{
		staffService.updateStaff(p);
		List<Staff> plist=staffService.getAllStaffs();
		return plist;
	}
	
	@DeleteMapping("staffs/{id}")
	public List<Staff> deleteStaff(@PathVariable("id") int id){
		staffService.deleteById(id);
		List<Staff> plist=staffService.getAllStaffs();
		return plist;
	}
}
