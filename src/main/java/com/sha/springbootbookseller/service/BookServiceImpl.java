package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.Book;
import com.sha.springbootbookseller.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book){
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }
    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    @Override
    public Optional<Book> findByTitle(String title){
        return bookRepository.findByTitle(title);
    }
    @Override
    public Optional<Book> findByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }
    @Override
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
}
