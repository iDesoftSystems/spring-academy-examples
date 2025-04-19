package com.idesoft.academy.examples.jetbrainsexposed.entities;

import org.jetbrains.exposed.dao.id.LongIdTable;

public class UserEntity extends LongIdTable {
    private String name;
    private String surname;

}
