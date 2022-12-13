package com.example.todoOpretion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.todoOpretion.entity.Employee;
import com.example.todoOpretion.service.EmpService;

@RestController
@RequestMapping("/todoOpretion")
public class EmployeeController {
	
	@Autowired
	private EmpService empService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getEmp")
	public List<Employee> getAllEmp(){
		List<Employee> em=empService.getAllEmp();
			
		return em;
		
	}
	
	

	
	
	
	
	

}
