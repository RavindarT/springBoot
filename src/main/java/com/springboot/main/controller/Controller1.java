package com.springboot.main.controller;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.controller.service.Service1;

@RestController
public class Controller1 {

	private static final Logger logger =  LoggerFactory.getLogger(Controller1.class); 
	
	@Autowired
	private Service1 service1;
	
	@GetMapping("/control1")
	public Object handle() throws Exception {
		logger.info("Controller");
		return service1.getService1();
	}
}
