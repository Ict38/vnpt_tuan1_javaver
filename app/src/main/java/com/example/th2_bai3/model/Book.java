package com.example.th2_bai3.model;

import java.io.Serializable;

public class Book implements Serializable {
    private int id;
    private String name, author, releaseDate, publisher, price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(int id, String name, String author, String releaseDate, String publisher, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.publisher = publisher;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Book( String name, String author, String releaseDate, String publisher, String price) {
        this.name = name;
        this.author = author;
        this.releaseDate = releaseDate;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }
}
