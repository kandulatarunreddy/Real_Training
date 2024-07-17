package com.training.oops;

/* An object is an instance of a class.
 * Use the new keyword to create an instance (object) of the class.
 * */
public class BookObject {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", "123456789");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
    }
}
