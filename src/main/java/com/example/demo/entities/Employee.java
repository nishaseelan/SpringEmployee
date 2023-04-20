package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")

public class Employee {

	@Id
	private long empid;
	private long salary;
	private String status;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@CreationTimestamp
	private Date createdAt;
//@OneToMany(targetEntity = Department.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//@JoinColumn(name ="DEPTID",referencedColumnName ="DEPTID")

//	@OneToMany(targetEntity = Department.class, cascade = CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name = "deptid")
//	private Set<Department> department;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "deptid")
	private Department department;

}