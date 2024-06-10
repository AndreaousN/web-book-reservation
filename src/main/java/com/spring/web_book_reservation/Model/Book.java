package com.spring.web_book_reservation.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "image")
    private String image;
    @Column(name = "PageNum")
    private int pages;
    @Column(name = "Category")
    private String category;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Book() {
    }

    public Book(String title, String description, String isbn, String image, int pages, String category) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.image = image;
        this.pages = pages;
        this.category = category;
    }

    public Book(int id, String title, String description, String isbn, String image, int pages, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.image = image;
        this.pages = pages;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}