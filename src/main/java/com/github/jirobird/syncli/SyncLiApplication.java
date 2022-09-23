package com.github.jirobird.syncli;

import com.github.jirobird.syncli.entity.Item;
import com.github.jirobird.syncli.entity.SyncedList;
import com.github.jirobird.syncli.repository.ItemRepository;
import com.github.jirobird.syncli.repository.PartnerRepository;
import com.github.jirobird.syncli.repository.SyncedListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SyncLiApplication implements CommandLineRunner {
    @Autowired
    SyncedListRepository syncedListRepository;

    @Autowired
    PartnerRepository partnerRepository;

    @Autowired
    ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(SyncLiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<SyncedList> syncedLists = syncedListRepository.findAll();
        List<Item> items = itemRepository.findAll();

        System.out.println("");
    }
}
