package com.chapter_pichincha.library.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    private String type;//e.g., "fiction", "non-fiction"
    private String format;//e.g., "digital", "physical"

    private String status; // e.g., "available", "borrowed"

    private LocalDateTime lastBorrowedDate;
}
