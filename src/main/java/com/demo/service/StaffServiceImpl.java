package com.demo.service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.jvnet.hk2.annotations.Service;
import com.demo.bean.Staff;

import com.demo.dao.StaffDao;
@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	StaffDao staffDao;


	@Override
	public List<Staff> getAllStaffs() {
		return staffDao.findAll();		
	}


	@Override
	public Optional<Staff> getStaffById(int Pid) {
		return staffDao.findById(Pid);
	}

	@Override
	public Staff updateStaff(Staff p) {
		return  staffDao.save(p);
		//return 1;
	}	
	@Override
	public int deleteById(int id) {
		Staff p=new Staff(id,null,null,null,null,null,0,0,0.0);
		staffDao.delete(p);
		 return 1;
	
	}

	@Override
	public void addStaff(Staff p) {
		staffDao.save(p);
		
	}

}
