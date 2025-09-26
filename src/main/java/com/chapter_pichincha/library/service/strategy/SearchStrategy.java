package com.chapter_pichincha.library.service.strategy;

import com.chapter_pichincha.library.model.Book;
import com.chapter_pichincha.library.repository.BookRepository;

import java.util.List;

public interface SearchStrategy {
    List<Book> search(BookRepository bookRepository);
}
