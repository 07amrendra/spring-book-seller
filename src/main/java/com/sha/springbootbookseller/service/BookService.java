package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    Optional<Book> findByTitle(String title);

    Optional<Book> findByAuthor(String author);

    List<Book> findAllBooks();
}
