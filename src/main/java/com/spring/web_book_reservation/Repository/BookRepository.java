package com.spring.web_book_reservation.Repository;

import com.spring.web_book_reservation.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("SELECT b FROM Book b WHERE b.id = :id")
    Book findById(int id);
}
