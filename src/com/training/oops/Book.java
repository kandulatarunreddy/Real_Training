package com.training.oops;

/* In Java, a class is a blueprint for creating objects. 
 * It defines a type by specifying the data (fields) and the behavior (methods) that objects of the class can have. 
 * A class encapsulates data for the object and methods to manipulate that data.
 * */

/* Components of a Java Class: 
 * Data member
 * Method
 * Constructor
 * Nested Class
 * Access modifiers, etc
 * */

public class Book {
    // Properties of the Book class
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize the properties
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter and Setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter methods for isbn
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
    public void displayDetails(String title) {

        System.out.println("Book title "+title);
    }
}
