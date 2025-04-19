package com.idesoft.academy.examples.jetbrainsexposed.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idesoft.academy.examples.jetbrainsexposed.entities.UserEntity;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    ResponseEntity<UserEntity> findById() {
        UserEntity.firstOrNull
    }
}
