package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.bean.Customer;

public interface CustomerService {

	
	List<Customer> getAllCustomers();

	Optional<Customer> getCustomerById(int jid);

	Customer updateCustomer(Customer p);

	int  deleteById(int j_id);
	
	void addCustomer(Customer p);
}
