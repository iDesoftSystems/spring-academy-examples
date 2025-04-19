package com.idesoft.academy.examples.jetbrainsexposed;

import org.jetbrains.exposed.spring.autoconfigure.ExposedAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration(ExposedAutoConfiguration.class)
public class JetbrainsexposedApplication {

    public static void main(String[] args) {
        SpringApplication.run(JetbrainsexposedApplication.class, args);
    }

}
