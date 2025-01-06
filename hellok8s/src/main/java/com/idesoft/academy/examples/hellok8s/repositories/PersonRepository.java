package com.idesoft.academy.examples.hellok8s.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idesoft.academy.examples.hellok8s.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
