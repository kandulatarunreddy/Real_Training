package com.training.exception;

/* Exception is an event that occurs during the execution of the program and interrupts the normal flow of program instructions.
 * It occurs at compile time or run time.
 * Only checked exceptions are known to the compiler.
 * It is mainly caused by the application itself.
 * */
import java.util.Scanner;  
public class Exceptions {
	public static void main(String args[])   
	{  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter a number: ");  
	int number = sc.nextInt();  
	System.out.println("You have entered: "+number);  
	}
}
