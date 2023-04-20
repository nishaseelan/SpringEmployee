package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Employee;

public interface Employeerepo extends  JpaRepository <Employee,Integer> {

//	Optional<Employee> stream();
//	
	    @Query(value="SELECT DEPTID FROM DEPRTMENT UNION ALL SELECT COUNT(*) FROM EMPLOYEE", nativeQuery= true)
	    List<Object[]> getEmployeeCountByDepartment();
	
}

	
	
	
	
	


