package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.bean.Staff;

public interface StaffService {
	List<Staff> getAllStaffs();

	Optional<Staff> getStaffById(int pid);

	Staff updateStaff(Staff p);

	int  deleteById(int id);

	void addStaff (Staff p);

}
