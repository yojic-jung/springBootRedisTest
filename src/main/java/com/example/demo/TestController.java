package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("test")
	public String test1(HttpSession session) {
		
		session.setAttribute("email","test");
		
		return "test";
	}
}
