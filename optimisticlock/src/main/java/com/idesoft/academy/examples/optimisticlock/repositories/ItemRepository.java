package com.idesoft.academy.examples.optimisticlock.repositories;

import com.idesoft.academy.examples.optimisticlock.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String> {
}
