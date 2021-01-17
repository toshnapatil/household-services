package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bean.Job;

@Repository
public interface JobDao extends JpaRepository<Job, Integer> {

	List<Job> findAll();
}