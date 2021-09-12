package com.sha.springbootbookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name="users") //user is reserved in postgres
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="user_name",unique=true,nullable=false,length=100)
    private String username;
    @Column(nullable = false,length = 100)
    private String password;
    @Column(nullable = false,length = 100)
    private  String name;
    @Column(nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name="role",nullable = false)
    private Role role;

    @Transient
    private String token;
}
