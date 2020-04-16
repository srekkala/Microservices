package com.cap.micro.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.micro.Service.EmployeeListServiceI;
import com.cap.micro.entities.Employee;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeListController {
	
	@Autowired
	EmployeeListServiceI service;
	
	@GetMapping("/fetch/{empId}")
	public ResponseEntity<Employee> findByempId(@PathVariable("empId") Integer empId){
		Employee employee=service.findByempId(empId);
		return new ResponseEntity<Employee>(employee, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/listAll")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> list=service.getAllEmployees();
		return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
	}
}
