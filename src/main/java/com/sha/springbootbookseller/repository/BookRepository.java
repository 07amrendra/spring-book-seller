package com.sha.springbootbookseller.repository;

import com.sha.springbootbookseller.model.Book;
import com.sha.springbootbookseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {
    Optional<Book> findByTitle(String title);
    Optional<Book> findByAuthor(String author);
}
