package com.spring.web_book_reservation.Controller;

import com.spring.web_book_reservation.Model.Book;
import com.spring.web_book_reservation.Service.BookService;
import com.spring.web_book_reservation.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
public class BookController {
    private final BookService bookService;
    private final UserService userService;

    @Autowired
    public BookController(@Qualifier("BookService") BookService bookService,
                          @Qualifier("UserService") UserService userService) {
        this.bookService = bookService;
        this.userService = userService;
    }

    @GetMapping("/bookstore")
    public String getBookStore(Model model) {
        model.addAttribute("book", new Book());
        return "bookstore";
    }
}
