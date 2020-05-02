package com.springboot.main.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.entity.Employee;
import com.springboot.main.entity.repository.EmployeeRepository;

import java.util.List;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class Service1 {

	private static final Logger logger =  LoggerFactory.getLogger(Service1.class);
			
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Object getService1() {
		JSONObject jsonObject = new JSONObject();
		logger.info("Service1");
		
		Employee employee = new Employee();
		employee.setName("test");
		employeeRepository.save(employee);
		
		List<Employee> empList = employeeRepository.findAll();
		jsonObject.put("empList", empList);
		return jsonObject;
	}
}
