package com.lcwa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperMan {

	/*
	 * RequestMapping is used to map with HTTP Methods
	 */
	@RequestMapping("/about")
	public String aboutRequestHandler() {
		System.out.println("Process about request");
		return "about";
	}
}
