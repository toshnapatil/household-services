package com.demo.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int J_ID;
	private String J_Name;
	
	 @OneToMany(targetEntity = ServiceProvider.class,cascade = CascadeType.ALL)
	 @JoinColumn(name ="J_ID",referencedColumnName = "J_ID")
	private List<ServiceProvider> ServiceProvider;
	
	public Job() {
		super();
	}

	public Job(int j_ID, String j_Name, List<com.demo.bean.ServiceProvider> serviceProvider) {
		super();
		J_ID = j_ID;
		J_Name = j_Name;
		this.ServiceProvider = serviceProvider;
	}
	

	public Job(int j_ID, String j_Name) {
		super();
		J_ID = j_ID;
		J_Name = j_Name;
	}

	public int getJ_ID() {
		return J_ID;
	}

	public void setJ_ID(int j_ID) {
		J_ID = j_ID;
	}

	public String getJ_Name() {
		return J_Name;
	}

	public void setJ_Name(String j_Name) {
		J_Name = j_Name;
	}

	public List<ServiceProvider> getServiceProvider() {
		return ServiceProvider;
	}

	public void setServiceProvider(List<ServiceProvider> serviceProvider) {
		ServiceProvider = serviceProvider;
	}

	@Override
	public String toString() {
		return "Job [J_ID=" + J_ID + ", J_Name=" + J_Name + ", ServiceProvider=" + ServiceProvider + "]";
	}

	
}
