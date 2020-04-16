package com.cap.micro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.micro.Service.EmployeeUpdateServiceI;
import com.cap.micro.entities.Employee;



@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeUpdateController {
	@Autowired
	EmployeeUpdateServiceI service;
	
	@Autowired 
	RestTemplate rest;
	@PutMapping("/Update")
	public ResponseEntity<Employee> UpdateEmployee(@RequestBody Employee employee) {
		Employee res=rest.getForObject("http://localhost:8888/employee/fetch/"+employee.getEmpId(), Employee.class);
		if(res!=null) {
		employee = service.UpdateEmployee(employee);
		}
		ResponseEntity<Employee> responseEntity = new ResponseEntity(employee, HttpStatus.OK);
		return responseEntity;
	}
	
}
