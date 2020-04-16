package com.cap.micro.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.micro.Dao.EmployeeDeleteDao;
@Service
@Transactional
public class EmployeeDeleteServiceImpl implements EmployeeDeleteServiceI{
	@Autowired
    private EmployeeDeleteDao dao;
	@Override
	public void deleteEmployeeById(Integer empId) {
		dao.delete(empId);
		
	}

}
