package com.example.todoOpretion.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "todotask")
public class Employee {

	@Id
	private String empId;
	private String empName;
	private String description;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime startDateTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private LocalDateTime endDateTime;

	List<Meeting> list = new ArrayList<>();

	public Employee() {
		super();

	}

	public Employee(String empId, String empName, String description, LocalDateTime startDateTime,
			LocalDateTime endDateTime) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.description = description;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}

	public Employee(String empId, String empName, String description, LocalDateTime startDateTime,
			LocalDateTime endDateTime, List<Meeting> list) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.description = description;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.list = list;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}

	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}

	public List<Meeting> getList() {
		return list;
	}

	public void setList(List<Meeting> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", description=" + description + ", startDateTime="
				+ startDateTime + ", endDateTime=" + endDateTime + ", list=" + list + "]";
	}

}
