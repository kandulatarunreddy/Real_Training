package com.training.exception;

/*The classes that inherit the RuntimeException are known as unchecked exceptions.
 * Unchecked exceptions are not checked at compile-time, but they are checked at runtime.*/
public class UnCheckedException {
	
    public static void main(String args[]) {
        try {  
            // ArithmeticException  
            int data = 100 / 0;  
        } catch (ArithmeticException e) {
            System.out.println(" ArithmeticException: " + e);
        }

        // NullPointerException
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println(" NullPointerException: " + e);
        }

        // NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException: " + e);
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            int value = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ArrayIndexOutOfBoundsException: " + e);
        }

        // StringIndexOutOfBoundsException
        try {
            String str = "example";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" StringIndexOutOfBoundsException: " + e);
        }
    }
}
