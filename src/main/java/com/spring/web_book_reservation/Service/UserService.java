package com.spring.web_book_reservation.Service;

import com.spring.web_book_reservation.Model.User;

public interface UserService {
    void createUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

    User getUserByUsername(String username);

    User getUserByEmail(String email);

    User getUserById(int id);
}
