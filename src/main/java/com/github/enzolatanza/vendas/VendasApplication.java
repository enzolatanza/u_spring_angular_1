package com.github.enzolatanza.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//esta annotation indica ao springboot que é uma classe de incialização
//annotation RestController indica que esta classe
//é um controlador Rest

@SpringBootApplication
@RestController
public class VendasApplication {
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
}