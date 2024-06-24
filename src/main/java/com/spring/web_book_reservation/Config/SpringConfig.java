package com.spring.web_book_reservation.Config;

import com.spring.web_book_reservation.Repository.BookRepository;
import com.spring.web_book_reservation.Repository.UserRepository;
import com.spring.web_book_reservation.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SpringConfig {
    private final BookRepository bookRepository;
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public SpringConfig(BookRepository bookRepository,
                        UserRepository userRepository,
                        BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Bean
    @Qualifier("BookService")
    public BookService getBookService() {
        return new BookServiceImpl(bookRepository);
    }

    @Bean
    @Qualifier("UserService")
    public UserService getUserService() {
        return new UserServiceImpl(userRepository, bCryptPasswordEncoder);
    }

    @Bean
    @Qualifier("UserDetailsService")
    public UserDetailsService getUserDetailsService() {
        return new UserDetailsServiceImpl(userRepository);
    }
}
