package com.training.oops;

/* Data abstraction is the process of hiding certain details and showing only essential information to the user.
   Abstraction can be achieved with either abstract classes or interfaces.
   If a class is having abstract method then class must be abstract.
   The child class must override parent abstract methods.
   we can't create abstract class directly.
   
*/

//Abstract class
abstract class AbstractBook {
// Attribute
private String bookName;

// Constructor
public AbstractBook(String bookName) {
 this.bookName = bookName;
}

// Abstract method (does not have a body)
public abstract void bookDetails();

// Regular method
public void showBookName() {
 System.out.println("Book Name: " + bookName);
}
}

//Subclass (inherit from AbstractBook)
class Novel extends AbstractBook {
public Novel(String bookName) {
 super(bookName);
}

public void bookDetails() {
 // The body of bookDetails() is provided here
 System.out.println("This is a novel.");
}
}

class BookAbstraction {
public static void main(String[] args) {
 Novel myNovel1 = new Novel("Novel1"); // Create a Novel object
 myNovel1.bookDetails();
 myNovel1.showBookName();
 AbstractBook myNovel2 = new Novel("Novel2"); // Create a Novel object
 myNovel2.showBookName();
 
}
}
