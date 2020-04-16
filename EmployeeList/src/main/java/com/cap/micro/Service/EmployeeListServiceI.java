package com.cap.micro.Service;
import java.util.List;

import com.cap.micro.entities.Employee;

public interface EmployeeListServiceI {
	Employee findByempId(Integer empId);
	List<Employee> getAllEmployees();
}
