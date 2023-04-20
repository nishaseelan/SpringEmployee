package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Employee;
import com.example.demo.repo.Employeerepo;
import com.example.demo.service.Employeeservice;

@RestController
public class Employeecontroller {

//      @Autowired
//       Employeerepo emprepo;

	@Autowired
	Employeeservice empser;

	@GetMapping("/findAll")
	List<Employee> getMethod() {
		return empser.getall();
	}

	@PostMapping("/insert")
	public Employee Add(@RequestBody Employee bean) {
		return empser.insert(bean);

	}

	@GetMapping("/mm")
	public ResponseEntity<Map<String, Employee>> getEmployeeWithMaxAndMinSalary() {
		Map<String, Employee> resultMap = empser.getEmployeeWithMaxAndMinSalary();
		return ResponseEntity.ok(resultMap);
	}

	@GetMapping("/count")
	public ResponseEntity<Map<Integer, Long>> EmployeeCount() {
		Map<Integer, Long> count = empser.EmpCount();
		return ResponseEntity.ok(count);
	}
}
