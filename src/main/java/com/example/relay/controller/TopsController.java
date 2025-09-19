package com.example.relay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tops")
public class TopsController {

	@GetMapping("/")
	public String index() {
		return "tops/index";
	}
}