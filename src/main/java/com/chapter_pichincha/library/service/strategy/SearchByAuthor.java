package com.chapter_pichincha.library.service.strategy;

import com.chapter_pichincha.library.model.Book;
import com.chapter_pichincha.library.repository.BookRepository;

import java.util.List;

public class SearchByAuthor implements SearchStrategy {
    private final String author;

    public SearchByAuthor(String author) {
        this.author = author;
    }


    @Override
    public List<Book> search(BookRepository bookRepository) {
        return bookRepository.findByAuthorContainingIgnoreCase(author);
    }
}
