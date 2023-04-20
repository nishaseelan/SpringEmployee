package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Department;

@Service

public class deptservice {
	
		@Autowired 
		com.example.demo.repo.deptrepo deptrepo;
		
		public List<Department>Deptservice(){
			return deptrepo.findAll();	
		}
		
		public Department insert(Department bean) {
			return deptrepo.save(bean);
		}
		
		public Department find(int id) {
			return deptrepo.findById(id).get();
		}
		
		
		
	}


