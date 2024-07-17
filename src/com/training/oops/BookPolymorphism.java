package com.training.oops;

/* Polymorphism allows us to perform a single action in different ways. 
 * Types of Java Polymorphism:
 * 1.Compile-time Polymorphism:
 * It is also known as static polymorphism. This type of polymorphism is achieved by function overloading.
   2.Runtime Polymorphism:
   It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. 
   This type of polymorphism is achieved by Method Overriding. 
   */

// The below code is using Method Overriding
class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String isbn, String downloadLink) {
        super(title, author, isbn);
        this.downloadLink = downloadLink;
    }

    
    
}

class PrintBook extends Book {
    private int pageCount;

    public PrintBook(String title, String author, String isbn, int pageCount) {
        super(title, author, isbn);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Page Count: " + pageCount);
    }
}

public class BookPolymorphism {
    public static void main(String[] args) {
        Book ebook = new EBook("Effective Java", "Joshua Bloch", "978-0134685991", "http://example.com/download");
        Book printBook = new PrintBook("Effective Java", "Joshua Bloch", "978-0134685991", 533);

        // Demonstrate polymorphism using Method Overriding
        ebook.displayDetails();
        System.out.println();
        printBook.displayDetails();
    }
}
