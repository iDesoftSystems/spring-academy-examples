package com.idesoft.academy.examples.optimisticlock.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Entity
public class Item {
    @Id
    private String id = UUID.randomUUID().toString();

    private int amount = 0;

    @Version
    private Long version;
}
