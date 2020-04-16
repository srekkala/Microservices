package com.cap.micro.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.micro.Dao.EmployeeUpdateDao;
import com.cap.micro.entities.Employee;
@Service
@Transactional
public class EmployeeUpdateServiceImpl implements EmployeeUpdateServiceI{
	@Autowired
	EmployeeUpdateDao dao;
	@Override
	public Employee UpdateEmployee(Employee employee) {
		return dao.save(employee);
	}

}
