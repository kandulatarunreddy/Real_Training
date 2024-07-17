package com.training.exception;


/* throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
 * throw keyword is followed by an instance of Exception to be thrown.
 * throw is used within the method.
 * allowed to throw only one exception at a time
 * */

/* throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
 * throws keyword is followed by class names of Exceptions to be thrown.
 * throws is used with the method signature.
 * declare multiple exceptions using throws keyword that can be thrown by the method.*/
public class Throw_Throws {
	
	static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing ArithmeticException");  
    }  
    //main method  
    public static void main(String args[])  
    {  
        try  
        {  
            method();  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("caught in main() method");  
        }  
    }  

}
