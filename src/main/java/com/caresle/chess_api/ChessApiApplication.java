package com.caresle.chess_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class ChessApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessApiApplication.class, args);
	}

	@GetMapping("/api")
	public String root() {
		return "Welcome to the Chess API";
	}
	

}
