package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GitItemEditController {

	@RequestMapping(path = "/gititemdit", method = RequestMethod.GET)
	public String editget(String name, String nedann) {

		System.out.println(name);
		System.out.println(nedann);
		
		return "gititemedit";
	}
	
	@RequestMapping(path = "/githennkou", method = RequestMethod.GET)
	public String editpost() {

		return "gehennkou";
	}
}
