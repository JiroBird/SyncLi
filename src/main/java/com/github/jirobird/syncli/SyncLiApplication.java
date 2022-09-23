package com.github.jirobird.syncli;

import com.github.jirobird.syncli.entity.Item;
import com.github.jirobird.syncli.entity.Partner;
import com.github.jirobird.syncli.entity.SyncedList;
import com.github.jirobird.syncli.entity.SyncedListItem;
import com.github.jirobird.syncli.repository.ItemRepository;
import com.github.jirobird.syncli.repository.PartnerRepository;
import com.github.jirobird.syncli.repository.SyncedListItemRepository;
import com.github.jirobird.syncli.repository.SyncedListRepository;
import liquibase.pro.packaged.I;
import liquibase.util.MD5Util;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class SyncLiApplication implements CommandLineRunner {
    @Autowired
    SyncedListRepository syncedListRepository;

    @Autowired
    PartnerRepository partnerRepository;

    @Autowired
    SyncedListItemRepository syncedListItemRepository;

    @Autowired
    ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(SyncLiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        long c = syncedListItemRepository.count();
        List<SyncedListItem> syncedListItems = syncedListItemRepository.findAll();
        List<SyncedList> syncedLists = syncedListRepository.findAll();
//        List<Partner> partners = partnerRepository.findAll();
        List<Item> items = itemRepository.findAll();

//        Item item1 = new Item();
//        item1.setName("Трындя");
//        ArrayList itemsArray = new ArrayList<Item>();
//        itemsArray.add(item1);
//        itemRepository.saveAllAndFlush(itemsArray);

        SyncedList list = syncedLists.get(1);
        SyncedListItem syncedListItem = new SyncedListItem();
        syncedListItem.setSyncedListId(list.getId());
        syncedListItem.setItemId("0fef0385-c718-46f2-9424-4e63d4ac34a5");
        System.out.println("");
        syncedListItemRepository.saveAndFlush(syncedListItem);
        c = syncedListItemRepository.count();
        syncedLists = syncedListRepository.findAll();
        System.out.println("");

//        SyncedList list = new SyncedList();
//        ArrayList items = new ArrayList<Item>();
//        Item item1 = new Item();
//        item1.setName("шняга");
//        items.add(item1);
//
//        Item item2 = new Item();
//        item2.setName("печенька");
//        items.add(item2);
//
//        list.setItem(items);
//        list.setName("что купить");
//        syncedListRepository.saveAndFlush(list);

//        Partner partner = new Partner();
//        partner.setName("Ушаков Данил");
//        partner.setLogin("JiroBird");
//        partner.setPassword(MD5Util.computeMD5("taijee7E"));
//
//        partnerRepository.saveAndFlush(partner);
    }
}
