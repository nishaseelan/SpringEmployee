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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Department")
public class Department {
	@Id
	private long deptid;

//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "created_at", nullable = false, updatable = false)
//	@CreatedDate
//	@CreationTimestamp
//	private Date createdAt;

	@OneToMany(targetEntity = Employee.class, mappedBy = "department", cascade = CascadeType.ALL)
//	@JoinColumn(name = "EMPID", referencedColumnName = "EMPID")
	private Set<Employee> employee;

//	@ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "EMPID", referencedColumnName = "EMPID")
//	private Employee employee;

}
