package com.gdl.lims.auth.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.lims.auth.service.AuthService;

@RequestMapping("/api")
@RestController
public class AuthController {

private static final Logger logger = LogManager.getLogger(AuthController.class);
	
	@Autowired
	private AuthService authService;
	
}
