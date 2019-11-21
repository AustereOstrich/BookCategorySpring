package com.matthewharrop.part1assignment1;

public class Book {

    Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    String isbn;
    String title;
    Float price;

    public String toString() {
        String bookString = "Book - ID: " + id + ", ISBN: " + isbn + ", Title: " + title +
                ", Price: " + price;
        return bookString;
    }

    public Book() {

    }

    public Book(Long id, String isbn, String title, Float price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

}
