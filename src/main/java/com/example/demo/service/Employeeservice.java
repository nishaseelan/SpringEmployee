package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.demo.entities.Employee;
import com.example.demo.repo.Employeerepo;

@Service

public class Employeeservice {

	@Autowired
	Employeerepo employeerepo;

	public List<Employee> getall() {
		return employeerepo.findAll();
	}

	public Employee insert(Employee bean) {
		return employeerepo.save(bean);
	}

	public Employee findid(int id) {
		return employeerepo.findById(id).get();
	}

	public Map<String, Employee> getEmployeeWithMaxAndMinSalary() {
		List<Employee> employees = employeerepo.findAll();
		Employee employeeWithMaxSalary = null;
		Employee employeeWithMinSalary = null;
		double maxSalary = Double.MIN_VALUE;
		double minSalary = Double.MAX_VALUE;
		for (Employee employee : employees) {
			if (employee.getSalary() > maxSalary) {
				maxSalary = employee.getSalary();
				employeeWithMaxSalary = employee;
			}
			if (employee.getSalary() < minSalary) {
				minSalary = employee.getSalary();
				employeeWithMinSalary = employee;
			}
		}
		Map<String, Employee> resultMap = new HashMap<>();
		resultMap.put("employeeWithMaxSalary", employeeWithMaxSalary);
		resultMap.put("employeeWithMinSalary", employeeWithMinSalary);
		return resultMap;

	}

	public Map<Integer, Long> EmpCount() {
		List<Object[]> results = employeerepo.getEmployeeCountByDepartment();
		Map<Integer, Long> count = new HashMap<>();
		for (Object[] result : results) {
			count.put((Integer) ((Number) result[0]).intValue(), (Long) result[1]);
		}
		return count;
	}

}
