package com.example.todoOpretion.Repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.todoOpretion.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, String> {

	

	

	
}
