package com.training.oops;

/* Inheritance is a mechanism by which one class is allowed to inherit the features(fields and methods) of another class. 
 * In Java, Inheritance means creating new classes based on existing ones. 
 * A class that inherits from another class can reuse the methods and fields of that class. 
 * In addition, you can add new fields and methods to your current class as well.  
 */

/* Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.'
 * Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves Run Time Polymorphism.
 * Abstraction: The concept of abstract where we do not have to provide all details, is achieved through inheritance. 
 * Abstraction only shows the functionality to the user.
 * */

/*The extends keyword is used to perform inheritance in Java.
 * The new class that is created is known as subclass (child or derived class) 
 * The existing class from where the child class is derived is known as superclass (parent or base class)
 * Here EBookDownload is child class and Book class is parent class.
 * */

class EBookDownload extends Book {
    private String downloadLink;

    public EBookDownload(String title, String author, String isbn, String downloadLink) {
        super(title, author, isbn);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }
}

public class BookInheritance {
    public static void main(String[] args) {
    	EBookDownload ebook = new EBookDownload("Effective Java", "Joshua Bloch", "978-0134685991", "http://example.com/download");
        System.out.println("Title: " + ebook.getTitle());
        System.out.println("Download Link: " + ebook.getDownloadLink());
    }
}
