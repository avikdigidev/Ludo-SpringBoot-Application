package com.avikdigidev.ludo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class LudoBackendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LudoBackendServiceApplication.class, args);
	}

}
