package com.demo.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Getter
//@Setter
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int C_ID;
	private String C_Name;
	private String C_Contact;
	private String C_Email_ID;
	private String C_Password;
	private String C_Add;
	private int C_Pincode;
	private long C_Photo;
	
	 @OneToMany(targetEntity = C_query.class,cascade = CascadeType.ALL)
	 @JoinColumn(name ="c_id",referencedColumnName = "C_ID")
	private List<C_query> c_query;
	
	public Customer() {}

	public Customer(int c_ID, String c_Name, String c_Contact, String c_Email_ID, String c_Password, String c_Add,
			int c_Pincode, long c_Photo, List<C_query> c_query) {
		super();
		C_ID = c_ID;
		C_Name = c_Name;
		C_Contact = c_Contact;
		C_Email_ID = c_Email_ID;
		C_Password = c_Password;
		C_Add = c_Add;
		C_Pincode = c_Pincode;
		C_Photo = c_Photo;
		this.c_query = c_query;
	}
	

	public Customer(int c_ID, String c_Name, String c_Contact, String c_Email_ID, String c_Password, String c_Add,
			int c_Pincode, long c_Photo) {
		super();
		C_ID = c_ID;
		C_Name = c_Name;
		C_Contact = c_Contact;
		C_Email_ID = c_Email_ID;
		C_Password = c_Password;
		C_Add = c_Add;
		C_Pincode = c_Pincode;
		C_Photo = c_Photo;

	}

	public int getC_ID() {
		return C_ID;
	}

	public void setC_ID(int c_ID) {
		C_ID = c_ID;
	}

	public String getC_Name() {
		return C_Name;
	}

	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}

	public String getC_Contact() {
		return C_Contact;
	}

	public void setC_Contact(String c_Contact) {
		C_Contact = c_Contact;
	}

	public String getC_Email_ID() {
		return C_Email_ID;
	}

	public void setC_Email_ID(String c_Email_ID) {
		C_Email_ID = c_Email_ID;
	}

	public String getC_Password() {
		return C_Password;
	}

	public void setC_Password(String c_Password) {
		C_Password = c_Password;
	}

	public String getC_Add() {
		return C_Add;
	}

	public void setC_Add(String c_Add) {
		C_Add = c_Add;
	}

	public int getC_Pincode() {
		return C_Pincode;
	}

	public void setC_Pincode(int c_Pincode) {
		C_Pincode = c_Pincode;
	}

	public long getC_Photo() {
		return C_Photo;
	}

	public void setC_Photo(long c_Photo) {
		C_Photo = c_Photo;
	}

	public List<C_query> getC_query() {
		return c_query;
	}

	public void setC_query(List<C_query> c_query) {
		this.c_query = c_query;
	}

	
	


}