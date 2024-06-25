package com.spring.web_book_reservation.Controller;

import com.spring.web_book_reservation.Model.User;
import com.spring.web_book_reservation.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @Autowired
    public UserController(@Qualifier("UserService") UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
    @GetMapping("/login")
    public String getLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") User user) {
        return "redirect:/bookStore";
    }

    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/registerUser")
    public String registerNewUser(@ModelAttribute("user") User user) {
        logger.info("Registering user: " + user.getUsername());
        userService.createUser(user);
        return "redirect:/login";
    }
}
