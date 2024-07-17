package com.training.oops;

//Class implementing the Book interface
class Textbook implements BookInterface {
// Attribute
private String bookName;

// Constructor
public Textbook(String bookName) {
   this.bookName = bookName;
}

@Override
public void bookDetails() {
   // The body of bookDetails() is provided here
   System.out.println("This is a textbook.");
}

@Override
public void showBookName(String bookName) {
   System.out.println("Book Name: " + this.bookName);
}
}

public class BookDataAbstractionInterface{
public static void main(String[] args) {
   Textbook myTextbook = new Textbook("Introduction to Algorithms"); // Create a Textbook object
   myTextbook.bookDetails();
   myTextbook.showBookName("");
}
}