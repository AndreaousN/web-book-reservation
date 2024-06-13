package com.spring.web_book_reservation.Service;

import com.spring.web_book_reservation.Model.Book;
import com.spring.web_book_reservation.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void insertBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }
}
