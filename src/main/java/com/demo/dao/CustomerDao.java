package com.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.bean.Customer;
import com.demo.dto.QueryperCustomer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	List<Customer> findAll();
	
	//   @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM customer c JOIN c.products p")
	//@Query("select c.C_Name , q.q_Name FROM customer c JOIN c.c_query p"); 
	//@Query(value = "SELECT new com.demo.dto.QueryperCustomer(C_Name,Q_Name,Q_Content,Q_Photo) from customer join c_query using (c_id);", nativeQuery = true)
	@Query("SELECT new com.demo.dto.QueryperCustomer(c.C_Name, q.Q_Name, q.Q_Content, q.Q_Photo) FROM Customer c JOIN c.c_query q")
	public List<QueryperCustomer> getJoinInformation();
	
	//Optional<User> findAll();
	//int updateProduct(Product p);
	
	//public Customer save();
		//Product findById(int id);
		
		//@Query("delete from productTab where id=20")
		//void delete(Product p);
	
	//@Query("select u from user u where u.U_Role= ?1")
	// List<User> getUserByU_Role(String U_Role);

	//public List<User> findByU_Role(String U_Role);
	//Optional<User> findByU_Role(String u_Role);
	
	//public List<User> findByU_NameAndU_Password(String U_Name,String U_Password);
	//--------------------
	//@Query(value = "select * from user u where u.U_Role= :U_Role", nativeQuery = true)
	//public List<Customer> getUsers(String U_Role);
	
	
//	@Query(value="select * from author a where a.first_name= :firstName", nativeQuery=true)
//    List<Author> getAuthorsByFirstName(String firstName);
}
