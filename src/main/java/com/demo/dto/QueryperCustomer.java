package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class QueryperCustomer {
	//C_Name,Q_Name,Q_Content,Q_Photo from customer join c_query using (c_id);
	
	private String C_Name;
	private String Q_Name;
	private String Q_Content;
	private long Q_Photo;
	
	public QueryperCustomer() {}
	
	public QueryperCustomer(String c_Name, String q_Name, String q_Content, long q_Photo) {
		super();
		C_Name = c_Name;
		Q_Name = q_Name;
		Q_Content = q_Content;
		Q_Photo = q_Photo;
	}

	public String getC_Name() {
		return C_Name;
	}

	public void setC_Name(String c_Name) {
		C_Name = c_Name;
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

	@Override
	public String toString() {
		return "QueryperCustomer [C_Name=" + C_Name + ", Q_Name=" + Q_Name + ", Q_Content=" + Q_Content + ", Q_Photo="
				+ Q_Photo + "]";
	}

	
	
}
