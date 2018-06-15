package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@RequestMapping("/createUser/{name}/{pwd}")
	public String createUser(@PathVariable String name, @PathVariable String pwd)
	{
		System.out.println("User Request Came with UserName:"+name+"   Password:"+pwd);
		return "Created";	
	}
}
