package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Department;

public interface deptrepo extends  JpaRepository <Department,Integer> {

	
	
}

