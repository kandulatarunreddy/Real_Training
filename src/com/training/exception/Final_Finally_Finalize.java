package com.training.exception;

/* final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.	
 * finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.	
 * finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
 * */

/*Object class contains the finalize method, hence finalize method is available for every Java class since Object is the superclass of all Java classes.
 * */
public class Final_Finally_Finalize {  
    //declaring final variable  
    final int phno = 1234567890;  
    void display() {  
      
    // reassigning value to age variable gives compile time error  
    	//phno = 55;  
    }  
    
 // defining the finalize method   
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }    
      
    public static void main(String[] args) {  
      
    Final_Finally_Finalize obj = new Final_Finally_Finalize();  
    // gives compile time error  
    //obj.display();  
   
        try {    
        // below code throws divide by zero exception  
         int data=25/0;    
         System.out.println(data);    
        }   
        // handles the Arithmetic Exception / Divide by zero exception  
        catch (ArithmeticException e){  
          System.out.println("Exception:"+ e);  
        }   
        // executes regardless of exception occurred or not   
        finally {  
          System.out.println("finally block is always executed");  
        }       
    
    // printing the hashcode   
    System.out.println("Hashcode is: " + obj.hashCode());           
    obj = null;    
    // calling the garbage collector using gc()   
    System.gc();     
    System.out.println("End of the garbage collection");     
}     
 
}  