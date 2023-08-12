package com.javawhizz.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javawhizz.App.model.Employee;
import com.javawhizz.App.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	  @GetMapping("/employees")
	  public Iterable<Employee> findAllEmployees() {
	    return this.employeeRepository.findAll();
	  }

	  @PostMapping("/employees")
	  public Employee addOneEmployee(@RequestBody Employee employee) {
	    return this.employeeRepository.save(employee);
	  }

}
