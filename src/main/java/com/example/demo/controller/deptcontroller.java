package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Department;
import com.example.demo.service.deptservice;

@RestController
public class deptcontroller {
	@Autowired
	deptservice deptser;

	@GetMapping("/findAlls")
	List<Department> getMethod1() {
		return deptser.Deptservice();

	}

	@PostMapping("/inserts")
	public Department Add1(@RequestBody Department bean) {
		return deptser.insert(bean);

	}

}
