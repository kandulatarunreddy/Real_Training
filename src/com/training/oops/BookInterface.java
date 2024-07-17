package com.training.oops;

/*
 * The interface in Java is a mechanism to achieve abstraction. 
 * There can be only abstract methods in the Java interface, not method body. 
 * It is used to achieve abstraction and multiple inheritance in Java.*/

public interface BookInterface {
	// Abstract method (does not have a body)
    void bookDetails();
    
    // Regular method
    default void showBookName(String bookName) {
        System.out.println("Book Name: " + bookName);
    }

}
