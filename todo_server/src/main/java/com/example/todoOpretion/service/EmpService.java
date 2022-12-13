package com.example.todoOpretion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todoOpretion.Repo.EmployeeRepo;
import com.example.todoOpretion.entity.Employee;

@Service
public class EmpService implements EmpImp {
	
	@Autowired
	private  EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getAllEmp() {
		 List<Employee> emp=(List<Employee>) employeeRepo.findAll();
		
		return (List<Employee>) emp;
	}


}
