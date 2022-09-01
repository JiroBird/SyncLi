package com.github.jirobird.syncli;

import com.github.jirobird.syncli.entity.Item;
import com.github.jirobird.syncli.entity.SyncedList;
import com.github.jirobird.syncli.repository.ItemRepository;
import com.github.jirobird.syncli.repository.SyncedListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class SyncLiApplication implements CommandLineRunner {
    @Autowired
    ItemRepository itemRepository;

    @Autowired
    SyncedListRepository syncedListRepository;

    public static void main(String[] args) {
        SpringApplication.run(SyncLiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        SyncedList list = new SyncedList();
//        ArrayList items = new ArrayList<Item>();
//        Item item1 = new Item();
//        item1.setCreatedAt(new Date());
//        item1.setUpdatedAt(new Date());
//        item1.setName("шняга");
//        item1.setSyncedlist(list);
//        items.add(item1);
//
//        Item item2 = new Item();
//        item2.setName("печенька");
//        item2.setCreatedAt(new Date());
//        item2.setUpdatedAt(new Date());
//        item2.setSyncedlist(list);
//        items.add(item2);
//
//        list.setItems(items);
//        list.setName("что купить");
//        list.setCreatedAt(new Date());
//        list.setUpdatedAt(new Date());
////        itemRepository.saveAllAndFlush(items);
//        syncedListRepository.saveAndFlush(list);
    }
}
