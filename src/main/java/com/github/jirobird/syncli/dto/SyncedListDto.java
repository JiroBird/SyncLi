package com.github.jirobird.syncli.dto;

import com.github.jirobird.syncli.entity.Item;
import com.github.jirobird.syncli.entity.SyncedList;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SyncedListDto {
    private SyncedListDto(){}

    private String id;
    private String name;
    private boolean completed;

    private List<ItemDto> items = new ArrayList<>();

    static SyncedListDto fromDB(SyncedList syncedList) {
        SyncedListDto syncedListDto = new SyncedListDto();
        syncedListDto.setId(syncedList.getId());
        syncedListDto.setName(syncedList.getName());
        syncedListDto.setCompleted(syncedList.isCompleted());

        for (Item item :syncedList.getItem()) {
            syncedListDto.getItems().add(ItemDto.fromDb(item));
        }

        return syncedListDto;
    }
}
