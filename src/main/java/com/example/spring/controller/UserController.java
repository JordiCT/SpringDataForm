package com.example.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.data.UserRepository;
import com.example.spring.model.User;
import com.example.spring.service.UserService;

@Controller
@RequestMapping(value = {"/"})

public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;
	
	
	@ModelAttribute("userList")
	public ArrayList<User> getUserList()
	{
		ArrayList<User> userList = (ArrayList<User>) userService.getUsers();
		return userList;
	}
	
	
	@GetMapping("/users")
	public String getUser(Model model) 
	{
		ArrayList<User> userList = (ArrayList<User>) userService.getUsers();
		model.addAttribute("userList", userList);
		return "userList";
	}
}
