package com.training.exception;


/*Error is an unexpected event that cannot be handled at runtime.
 * There are 3 types of Errors: Syntax Error, Runtime Error, Logical Error
 */

/*Errors are problems that mainly occur due to the lack of system resources.
 * It cannot be caught or handled. It indicates a serious problem. It occurs at run time. 
 * These are always unchecked. An example of errors is OutOfMemoryError, LinkageError, AssertionError, etc. are the subclasses of the Error class.
 * */
public class Error {
	
	public static void recursiveDemo(int i)  
	{  
	while(i!=0)  
	{  
	//increments the variable i by 1  
	i=i+1;  
	//recursive called method  
	recursiveDemo(i);  
	} 
	}
	
	public static void main(String[] args){
        int n = 5;
        boolean isEven = (n % 2 == 0) ? true : false;
        
     // StackOverflowError
        recursiveDemo(5);
        
        //Logical errors
        int num = 5;
        int xor = 0;
        // Run the loop.
        int i;
        for (i = 1; i <= num; i++);
        {
          xor = xor ^ i;
        }
        System.out.println("Xor of all numbers is: " + xor);
     
      }
	
}
