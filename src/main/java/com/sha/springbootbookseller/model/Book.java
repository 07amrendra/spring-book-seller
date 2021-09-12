package com.sha.springbootbookseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false,length = 1000)
    private String description;

    @Column(nullable = false,length = 100)
    private String author;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private LocalDateTime createTime;
}
