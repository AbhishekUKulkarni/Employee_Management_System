package com.java.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ems.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{}
