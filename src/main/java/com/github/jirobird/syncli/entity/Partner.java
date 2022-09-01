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
@Table(name = "partners")
public class Partner implements Serializable {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(length = 36)
    private String id;

    @Column private String name;
    @Column private String login;
    @Column private String password;
}
