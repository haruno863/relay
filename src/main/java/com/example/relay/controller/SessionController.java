package com.example.relay.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SessionController {
	@GetMapping("/login")
	public String index() {
		return "sessions/new";
	}
}
