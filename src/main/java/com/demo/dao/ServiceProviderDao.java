package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.demo.bean.ServiceProvider;

@Repository
public interface ServiceProviderDao extends JpaRepository<ServiceProvider, Integer> {

	List<ServiceProvider> findAll();

	//int updateProduct(Product p);
	
	//public Product save();
		//Product findById(int id);
		
		//@Query("delete from productTab where id=20")
		//void delete(Product p);
	

}
