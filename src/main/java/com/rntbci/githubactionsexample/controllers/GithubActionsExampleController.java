package com.rntbci.githubactionsexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GithubActionsExampleController {
	
	@GetMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring Boot Git hub Actions Example project!";
	}
}
