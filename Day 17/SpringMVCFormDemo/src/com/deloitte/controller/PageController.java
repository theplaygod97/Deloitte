package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/doprofile")
	public String pp() {
		return "doprofile";
	}
	@RequestMapping("/customer")
	public String cust() {
		return "customer";
	}
	@RequestMapping("/employee")
	public String empl() {
		return "employee";
	}
	@RequestMapping("/product")
	public String pro() {
		return "product";
	}
	@RequestMapping("/Guest")
	public String guest() {
		return "guest";
	}
	
}
