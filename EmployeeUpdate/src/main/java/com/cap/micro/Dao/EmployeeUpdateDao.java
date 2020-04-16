package com.cap.micro.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cap.micro.entities.Employee;
@Repository
public interface EmployeeUpdateDao extends JpaRepository<Employee, Integer>{

}
