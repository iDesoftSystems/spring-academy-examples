package com.idesoft.academy.examples.optimisticlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.idesoft.academy.examples.optimisticlock")
public class OptimisticlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptimisticlockApplication.class, args);
	}

}
