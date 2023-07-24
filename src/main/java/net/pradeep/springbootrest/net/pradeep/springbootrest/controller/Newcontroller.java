package net.pradeep.springbootrest.net.pradeep.springbootrest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Newcontroller {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello pradeep";
	}

}
