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

import javax.transaction.Transactional;
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
    @Transactional
    public void run(String... args) throws Exception {

//        List<SyncedList> syncedLists = syncedListRepository.findAll();
//        SyncedList list = syncedLists.get(0);
//        List<Item> items = list.getItem();
//        int c = items.size();
//        List<Item> items = itemRepository.findAll();
//
//        SyncedList last = syncedLists.get(syncedLists.size() - 1);

//        Item i = new Item();
//        i.setName("Пыхтя");
//        last.getItem().add(i);
//
//        syncedListRepository.saveAndFlush(last);
//        syncedLists = syncedListRepository.findAll();
//        items = itemRepository.findAll();
//        System.out.println("");
    }
}
