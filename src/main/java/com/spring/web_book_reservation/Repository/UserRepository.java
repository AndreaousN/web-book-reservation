package com.spring.web_book_reservation.Repository;

import com.spring.web_book_reservation.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.id = :id")
    User findById(int id);

    User findByUsername(String username);

    User findByEmail(String email);
}
