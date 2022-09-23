package com.github.jirobird.syncli.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString

@Entity
@Table(name = "partners")
public class Partner extends AuditEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(length = 36)
    private String id;

    @Column private String name;
    @Column private String login;
    @Column private String password;
    @Column private String token;
    @Column Date tokenExpDate;
}
