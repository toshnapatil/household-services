package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Staff;
@Repository
public interface StaffDao extends JpaRepository<Staff, Integer> {

	List<Staff> findAll();
}
