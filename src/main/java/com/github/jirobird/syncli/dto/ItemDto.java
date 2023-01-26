package com.github.jirobird.syncli.dto;

import com.github.jirobird.syncli.entity.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {

    private ItemDto(){}

    private String id;
    private String name;

    static ItemDto fromDb(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());

        return itemDto;
    }
}
