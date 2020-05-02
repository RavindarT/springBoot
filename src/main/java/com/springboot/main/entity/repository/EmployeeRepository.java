package com.springboot.main.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}