package com.example.relay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/informs")
public class InformsController {

	@GetMapping("/")
	public String index() {
		return "informs/index";
	}
}