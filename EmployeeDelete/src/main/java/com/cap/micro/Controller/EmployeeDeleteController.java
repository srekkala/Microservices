package com.cap.micro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.micro.Service.EmployeeDeleteServiceI;
import com.cap.micro.entities.Employee;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeDeleteController {
	@Autowired
	EmployeeDeleteServiceI service;
	
	@Autowired
	RestTemplate rest;
	
	@DeleteMapping("/delete/{empId}") 
	public String deleteEmployeeById(@PathVariable("empId") Integer empId)  {
		Employee employee=rest.getForObject("http://localhost:8888/employee/fetch/"+empId, Employee.class);
		if(employee!=null) {
		service.deleteEmployeeById(empId);
		return "Deleted";
		}
		else {
			return "Employee with id:"+empId+"does not exists";
		}
	}

}
