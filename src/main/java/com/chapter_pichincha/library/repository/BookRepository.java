package com.chapter_pichincha.library.repository;

import com.chapter_pichincha.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Búsqueda por título (case insensitive y coincidencia parcial)
    List<Book> findByTitleContainingIgnoreCase(String title);

    // Búsqueda por autor (case insensitive y coincidencia parcial)
    List<Book> findByAuthorContainingIgnoreCase(String author);
}
