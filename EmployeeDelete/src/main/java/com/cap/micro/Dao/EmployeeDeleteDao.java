package com.cap.micro.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.micro.entities.Employee;

public interface EmployeeDeleteDao extends JpaRepository<Employee, Integer>{

}
