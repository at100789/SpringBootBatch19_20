package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoints;
import com.extreme.finance.model.Login;
import com.extreme.finance.service.LoginService;

@RestController
public class LoginController {

	@Autowired 
	private LoginService loginService;
	
	@PostMapping(value = ApiEndpoints.ADDEMPLOYEE)
	public String AddLoginAndEmployeeData(@RequestBody Login login) {
		System.out.println("In Controller : " + login);
		loginService.addLoginDataWithEmployee(login);
		return "Employee Added....!";
	}
}
