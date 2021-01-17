package com.demo.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Entity
public class C_query {
	
	@Id
	@GeneratedValue
	private int CQ_ID;
	private String Q_Name;
	private String Q_Content;
	private long Q_Photo;
	
	public C_query() {
	
	}

	public C_query(int cQ_ID, String q_Name, String q_Content, long q_Photo) {
		super();
		CQ_ID = cQ_ID;
		Q_Name = q_Name;
		Q_Content = q_Content;
		Q_Photo = q_Photo;
	}

	public int getCQ_ID() {
		return CQ_ID;
	}

	public void setCQ_ID(int cQ_ID) {
		CQ_ID = cQ_ID;
	}

	public String getQ_Name() {
		return Q_Name;
	}

	public void setQ_Name(String q_Name) {
		Q_Name = q_Name;
	}

	public String getQ_Content() {
		return Q_Content;
	}

	public void setQ_Content(String q_Content) {
		Q_Content = q_Content;
	}

	public long getQ_Photo() {
		return Q_Photo;
	}

	public void setQ_Photo(long q_Photo) {
		Q_Photo = q_Photo;
	}
	
	

}
