package com.idesoft.academy.examples.optimisticlock.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Slf4j
@Service
public class InventoryService {
    private  final ItemService itemService;

    @Transactional(readOnly = true)
    public void incrementProductAmount(String itemId, int amount) {
        try {
            itemService.incrementAmount(itemId, amount);
        } catch (ObjectOptimisticLockingFailureException e) {
            log.warn("somebody has already updated the amount for item: {} in concurrent transaction. Will try again...", itemId);
            itemService.incrementAmount(itemId, amount);
        }
    }
}
