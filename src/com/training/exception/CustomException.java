package com.training.exception;

/* Custom exception also called user-defined exception
 * It need to extend Exception class
 * Using the custom exception, we can have your own exception and message. 
 * We have passed a string to the constructor of superclass 
 * i.e. Exception class that can be obtained using getMessage() method on the object we have created.*/

class InvalidUserException extends Exception {
    // Constructor that accepts a message
	
	//Here, we have passed a string to the constructor of superclass 
	//i.e. Exception class that can be obtained using getMessage() method on the object we have created.
    public InvalidUserException(String message) {
        super(message);
    }
}

public class CustomException {
    // Method to validate username and password
    public static void validateUser(String username, String password) throws InvalidUserException {
        if (username == null || username.length() < 5) {
            throw new InvalidUserException("Username must be at least 5 characters long.");
        }
        if (password == null || password.isEmpty()) {
            throw new InvalidUserException("Password cannot be empty.");
        }
        System.out.println("User is valid.");
    }
    
    public static void main(String[] args) {
        try {
            CustomException.validateUser("tarun", "123456789"); // This will not trigger the exception
        } catch (InvalidUserException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        try {
            CustomException.validateUser("tarun", ""); // This will trigger the exception due to empty password
        } catch (InvalidUserException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            CustomException.validateUser("sai", "1234567"); // This will trigger the exception due to short username
        } catch (InvalidUserException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
