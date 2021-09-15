package com.capone.practicaORM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//El RestController significa que esta clase va a poder manejar requests y responses (?).
@RestController
public class PracticaOrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaOrmApplication.class, args);
	}

	@GetMapping
	public String holis() {
		return "Holis";
	}

}
