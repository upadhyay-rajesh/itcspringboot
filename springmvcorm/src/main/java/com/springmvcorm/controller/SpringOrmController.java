package com.springmvcorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcorm.entity.FacebookEmployee;
import com.springmvcorm.service.SpringOrmServiceInterface;

@Controller
public class SpringOrmController {
	@Autowired
	private SpringOrmServiceInterface service;
	
	//if any request will come to controller first it matches @RequestMapping value as follow
	
	@RequestMapping("register.htm") //this mapping will match from registeration.jsp file <form action="register.htm">
	public ModelAndView registerUser(@RequestParam("name") String name, //String name=request.getParameter("name");
			@RequestParam("pass") String password,
			@RequestParam("email") String email,
			@RequestParam("address") String address
			) {
		//the above data(name,password,email,address) we have to transfer to service layer via DTO
		//(data transfer object) Design pattern 
		//so we should create object of entity and should set data as follow
		//how to create entity?
		FacebookEmployee fe=new FacebookEmployee();
		fe.setName(name);
		fe.setEmail(email);
		fe.setAddress(address);
		fe.setPassword(password);
		//entity fe ready to transfer on service layer
		int i=service.registerUserService(fe); 
		String ss="Registration Fail";
		if(i>0) {
			ss="Registration Success";
		}
		ModelAndView mv=new ModelAndView();
		mv.addObject("a1", ss);
		mv.setViewName("registration.jsp");
		return mv;
	}
}
