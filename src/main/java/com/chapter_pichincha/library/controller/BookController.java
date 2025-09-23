package com.chapter_pichincha.library.controller;

import com.chapter_pichincha.library.model.Book;
import com.chapter_pichincha.library.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {
        return ResponseEntity.ok(bookService.addBook(book));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/search/title/{title}")
    public ResponseEntity<List<Book>> findByTitle(@PathVariable String title) {
        List<Book> books = bookService.findByTitle(title);
        return books.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(books);
    }
}
