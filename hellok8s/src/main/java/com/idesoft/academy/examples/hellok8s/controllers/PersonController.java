package com.idesoft.academy.examples.hellok8s.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idesoft.academy.examples.hellok8s.entities.Person;
import com.idesoft.academy.examples.hellok8s.repositories.PersonRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/people")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @GetMapping
    ResponseEntity<List<Person>> findAllPeople() {
        List<Person> people = personRepository.findAll();
        return ResponseEntity.ok(people);
    }
}
