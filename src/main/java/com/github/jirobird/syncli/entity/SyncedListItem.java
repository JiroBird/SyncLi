package com.github.jirobird.syncli.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString

@Entity
@Table(name = "syncedlist_item")
public class SyncedListItem  implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(length = 36, name = "synced_list_id")
    private String syncedListId;

    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(length = 36, name = "item_id")
    private String itemId;
}
