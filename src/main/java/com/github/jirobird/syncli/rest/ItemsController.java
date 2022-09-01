package com.github.jirobird.syncli.rest;

import com.github.jirobird.syncli.entity.Item;
import com.github.jirobird.syncli.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {

    private final ItemRepository repository;
    ItemsController(ItemRepository iRepository) {
        repository = iRepository;
    }

    @GetMapping("/items_count")
    long getItemsCount() {
        return repository.count();
    }

    @GetMapping("/item")
    Item getItem(@RequestParam String item_name) {
        return repository.findByName(item_name);
    }
}
