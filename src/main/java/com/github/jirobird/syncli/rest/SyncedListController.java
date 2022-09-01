package com.github.jirobird.syncli.rest;

import com.github.jirobird.syncli.entity.SyncedList;
import com.github.jirobird.syncli.repository.SyncedListRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SyncedListController {
    private final SyncedListRepository repository;

    SyncedListController(SyncedListRepository iRepository) {
        repository = iRepository;
    }

    @GetMapping("/list")
    long getAllList(){
        List<SyncedList> list = repository.findAll();
        int c = list.get(0).getItem().size();
        return repository.count();
    }
}
