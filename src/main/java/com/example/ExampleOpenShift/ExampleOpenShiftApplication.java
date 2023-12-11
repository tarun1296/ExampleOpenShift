package com.example.ExampleOpenShift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExampleOpenShiftApplication {

	@GetMapping("/")
	public String gettext() {
		return "Welcome";
	}
	
	@PostMapping("/{input}")
	public String gettext(@PathVariable String input) {
		return "Welcome" + input;
	}
	public static void main(String[] args) {
		SpringApplication.run(ExampleOpenShiftApplication.class, args);
	}

}
