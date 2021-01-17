package com.demo.dto;

import com.demo.bean.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@ToString
//@Getter
//@Setter
public class C_queryRequest {
	
	 private Customer customer;

	 
	public C_queryRequest() {
		//super();
	}
	

	public C_queryRequest(Customer customer) {
		super();
		this.customer = customer;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}




}
