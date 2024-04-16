package com.example.devopsautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsAutomationApplication {

	@GetMapping("/message")
	public String message() {
		return "Welcome to CI/CD !!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopsAutomationApplication.class, args);
	}

}
