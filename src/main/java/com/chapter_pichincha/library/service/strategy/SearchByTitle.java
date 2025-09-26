package com.chapter_pichincha.library.service.strategy;

import com.chapter_pichincha.library.model.Book;
import com.chapter_pichincha.library.repository.BookRepository;

import java.util.List;

public class SearchByTitle implements SearchStrategy {
    private final String title;

    public SearchByTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Book> search(BookRepository bookRepository) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }
}
