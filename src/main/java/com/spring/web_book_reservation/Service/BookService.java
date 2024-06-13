package com.spring.web_book_reservation.Service;

import com.spring.web_book_reservation.Model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    void insertBook(Book book);

    void updateBook(Book book);

    void deleteBook(int id);

    Book getBookById(int id);
}
