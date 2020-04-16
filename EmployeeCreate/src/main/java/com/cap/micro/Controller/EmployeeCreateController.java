package com.cap.micro.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.micro.Service.EmployeeCreateServiceI;
import com.cap.micro.entities.Employee;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeCreateController {
	@Autowired
	EmployeeCreateServiceI service;
	@PostMapping("/create")
	public ResponseEntity<Boolean> CreateEmployee(@RequestBody Employee employee)  {
		employee = service.CreateEmployee(employee);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity<Boolean>(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
}
