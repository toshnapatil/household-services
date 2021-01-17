package com.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {

    @Id
	
	private int S_ID;
	private String S_Name;
	private String S_Contact;
	private String S_Email_ID;
	private String S_Password;
	private String S_Add;
	private int S_Pincode;
	private long S_Photo;
	private double S_Sal;
	

	public Staff() {
		super();
	}

	public Staff(int s_ID, String s_Name, String s_Contact, String s_Email_ID, String s_Password, String s_Add,
			int s_Pincode, long s_Photo, double s_Sal) {
		super();
		S_ID = s_ID;
		S_Name = s_Name;
		S_Contact = s_Contact;
		S_Email_ID = s_Email_ID;
		S_Password = s_Password;
		S_Add = s_Add;
		S_Pincode = s_Pincode;
		S_Photo = s_Photo;
		S_Sal = s_Sal;
	}

	public int getS_ID() {
		return S_ID;
	}

	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}

	public String getS_Name() {
		return S_Name;
	}

	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}

	public String getS_Contact() {
		return S_Contact;
	}

	public void setS_Contact(String s_Contact) {
		S_Contact = s_Contact;
	}

	public String getS_Email_ID() {
		return S_Email_ID;
	}

	public void setS_Email_ID(String s_Email_ID) {
		S_Email_ID = s_Email_ID;
	}

	public String getS_Password() {
		return S_Password;
	}

	public void setS_Password(String s_Password) {
		S_Password = s_Password;
	}

	public String getS_Add() {
		return S_Add;
	}

	public void setS_Add(String s_Add) {
		S_Add = s_Add;
	}

	public int getS_Pincode() {
		return S_Pincode;
	}

	public void setS_Pincode(int s_Pincode) {
		S_Pincode = s_Pincode;
	}

	public long getS_Photo() {
		return S_Photo;
	}

	public void setS_Photo(long s_Photo) {
		S_Photo = s_Photo;
	}

	public double getS_Sal() {
		return S_Sal;
	}

	public void setS_Sal(double s_Sal) {
		S_Sal = s_Sal;
	}

	@Override
	public String toString() {
		return "Staff [S_ID=" + S_ID + ", S_Name=" + S_Name + ", S_Contact=" + S_Contact + ", S_Email_ID=" + S_Email_ID
				+ ", S_Password=" + S_Password + ", S_Add=" + S_Add + ", S_Pincode=" + S_Pincode + ", S_Photo="
				+ S_Photo + ", S_Sal=" + S_Sal + "]";
	}
	
	

}
