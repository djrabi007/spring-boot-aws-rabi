package com.rabitechie.aws.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSController {

	@GetMapping("/")
	public String m1() {
		return "Welcome to RABI- AWS !! ";
	}

}
