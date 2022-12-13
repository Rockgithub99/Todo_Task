package com.example.todoOpretion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.todoOpretion.entity.Employee;

@Service
public interface EmpImp {
	
	public List<Employee> getAllEmp();
	

}
