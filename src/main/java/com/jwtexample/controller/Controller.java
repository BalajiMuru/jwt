package com.jwtexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtexample.Service.UserService;
import com.jwtexample.model.User;

@RestController
@RequestMapping("/home")
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("Getting users");
		return userService.getUser();
	}

}
