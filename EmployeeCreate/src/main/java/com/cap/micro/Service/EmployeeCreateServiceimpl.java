package com.cap.micro.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.micro.Dao.EmployeeCreateDao;
import com.cap.micro.entities.Employee;
@Service
@Transactional
public class EmployeeCreateServiceimpl implements EmployeeCreateServiceI {
	
	@Autowired
	EmployeeCreateDao dao;

	@Override
	public Employee CreateEmployee(Employee employee) {
		return dao.save(employee);
	}

}
