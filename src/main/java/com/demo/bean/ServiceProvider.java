package com.demo.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="`service provider`")
public class ServiceProvider {
	@Id
	@GeneratedValue
	private int SP_ID;
	private String SP_Name;
	private String SP_Contact;
	private String SP_Email_ID;
	private String SP_Password;
	private String SP_Add;
	private int SP_Pincode;
	private long SP_Photo;
	private double SP_Exp;
	//private int J_ID;
	
	
	
	public ServiceProvider() {
		super();
	}


	public ServiceProvider(int sP_ID, String sP_Name, String sP_Contact, String sP_Email_ID, String sP_Password,
			String sP_Add, int sP_Pincode, long sP_Photo, double sP_Exp) {
		super();
		SP_ID = sP_ID;
		SP_Name = sP_Name;
		SP_Contact = sP_Contact;
		SP_Email_ID = sP_Email_ID;
		SP_Password = sP_Password;
		SP_Add = sP_Add;
		SP_Pincode = sP_Pincode;
		SP_Photo = sP_Photo;
		SP_Exp = sP_Exp;
		//J_ID = j_ID;
	}


	public int getSP_ID() {
		return SP_ID;
	}


	public void setSP_ID(int sP_ID) {
		SP_ID = sP_ID;
	}


	public String getSP_Name() {
		return SP_Name;
	}


	public void setSP_Name(String sP_Name) {
		SP_Name = sP_Name;
	}


	public String getSP_Contact() {
		return SP_Contact;
	}


	public void setSP_Contact(String sP_Contact) {
		SP_Contact = sP_Contact;
	}


	public String getSP_Email_ID() {
		return SP_Email_ID;
	}


	public void setSP_Email_ID(String sP_Email_ID) {
		SP_Email_ID = sP_Email_ID;
	}


	public String getSP_Password() {
		return SP_Password;
	}


	public void setSP_Password(String sP_Password) {
		SP_Password = sP_Password;
	}


	public String getSP_Add() {
		return SP_Add;
	}


	public void setSP_Add(String sP_Add) {
		SP_Add = sP_Add;
	}


	public int getSP_Pincode() {
		return SP_Pincode;
	}


	public void setSP_Pincode(int sP_Pincode) {
		SP_Pincode = sP_Pincode;
	}


	public long getSP_Photo() {
		return SP_Photo;
	}


	public void setSP_Photo(long sP_Photo) {
		SP_Photo = sP_Photo;
	}


	public double getSP_Exp() {
		return SP_Exp;
	}


	public void setSP_Exp(double sP_Exp) {
		SP_Exp = sP_Exp;
	}
	
	
}
