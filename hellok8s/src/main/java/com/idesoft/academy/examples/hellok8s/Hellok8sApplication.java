package com.idesoft.academy.examples.hellok8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.idesoft.academy.examples.hellok8s")
public class Hellok8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hellok8sApplication.class, args);
    }

}
