package com.cap.micro.Service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.micro.Dao.EmployeeDao;
import com.cap.micro.entities.Employee;

@Service
@Transactional
public class EmployeeListServiceImpl implements EmployeeListServiceI {
		@Autowired
	    private EmployeeDao dao;

		@Override
		public Employee findByempId(Integer empId) {
			return dao.findByempId(empId);
		}

		@Override
		public List<Employee>getAllEmployees() {
			return dao.findAll();
		}
		
		
}
