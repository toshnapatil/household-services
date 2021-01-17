package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Customer;
import com.demo.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	CustomerDao customerDao;

   
	public List<Customer> getAllCustomers() {
		return customerDao.findAll();		
	}


	public Optional<Customer> getCustomerById(int jid) {
		return customerDao.findById(jid);
	}

	public Customer updateCustomer(Customer p) {
		return  customerDao.save(p);
		//return 1;
		
	}

	public int deleteById(int id) {
		Customer p=new Customer(id,null,null,null,null,null,0,0);
		customerDao.delete(p);
		 return 1;
	}

	public void addCustomer(Customer p) {
		customerDao.save(p);
		
	}

	
}
