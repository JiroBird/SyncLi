package com.github.jirobird.syncli.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString

@Entity
@Table(name = "syncedlist")
public class SyncedList extends AuditEntity  {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(length = 36)
    private String id;

    @Column
    private String name;

    @Column
    private int timestamp;

    @Column
    private boolean completed;

    @OneToMany(mappedBy = "syncedlist")
    private List<Item> items = new ArrayList<>();
}
