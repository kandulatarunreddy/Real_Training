package com.training.oops;

/* A constructor in Java is a special method that is used to initialize objects. 
 * The constructor is called when an object of a class is created. 
 * It can be used to set initial values for object attributes
 * constructor name must match the class name, and it cannot have a return type.
 * */
public class BookConstructor {
 // Fields
 private String title;
 private String author;
 private int yearPublished;
 private double price;

 // Default constructor
 public BookConstructor() {
     this.title = "Learn Java";
     this.author = "Tarun";
     this.yearPublished = 2024;
     this.price = 10.0;
 }


 // Constructor with all fields
 public BookConstructor(String title, String author, int yearPublished, double price) {
     this.title = title;
     this.author = author;
     this.yearPublished = yearPublished;
     this.price = price;
 }

 // Getter and Setter methods
 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public int getYearPublished() {
     return yearPublished;
 }

 public void setYearPublished(int yearPublished) {
     this.yearPublished = yearPublished;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 // Method to display book details
 public void displayBookDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Year Published: " + yearPublished);
     System.out.println("Price: $" + price);
 }

 // Main method to test the Book class
 public static void main(String[] args) {
     // Using default constructor
	 BookConstructor defaultBook = new BookConstructor();
     defaultBook.displayBookDetails();
     System.out.println();
     
     // Using constructor with all fields
     BookConstructor completeBook = new BookConstructor("Devops", "Anuj", 2023, 15.99);
     completeBook.displayBookDetails();
 }
}
