package com.training.oops;

/* Encapsulation in Java is a process of wrapping code and data together into a single unit.
 * Encapsulation is achieved by declaring the instance variables of a class as private, 
 * which means they can only be accessed within the class. 
 * To allow outside access to the instance variables, public methods called getters and setters are defined,
 * which are used to retrieve and modify the values of the instance variables*/

public class BookEncapsulation {
    // Properties of the Book class
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize the properties
    public BookEncapsulation(String title, String author, String isbn) {
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
    
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", "987654321");
        book.setTitle("Effective Java, 3rd Edition");
        System.out.println("Updated Title: " + book.getTitle());
    }
}
