package com.training.exception;


import java.io.FileNotFoundException;   
import java.io.FileReader;  
import java.io.IOException;
import java.net.MalformedURLException;  
import java.net.URL; 
import java.text.ParseException; 
import java.text.SimpleDateFormat;  
import java.util.Date; 


/* checked exceptions/compile-time exceptions represent errors outside the control of the program. 
 * */
public class CheckedExceptions {
	public static void main(String[] args) { 
		
		//FileNotFoundException
        try {  
        	FileReader file = new FileReader("C:\\Java_Codes\\a.txt");  
        } catch (FileNotFoundException e) {  
            System.out.println("File not found: " + e.getMessage());  
        } 
        
        //IOException
        try {  
        	String str = "Hello World!!";
            byte[] bytes;
            bytes = str.getBytes("UTF");
        } catch (IOException e) {  
            System.out.println("IOException: " + e.getMessage());  
        } 
        
        //MalformedURLException
        String invalidURL = "htp://tarun.com";  
        try {  
            URL url = new URL(invalidURL);  
            System.out.println("Valid URL: " + url.toString());  
        } catch (MalformedURLException e) {  
            System.out.println("Malformed URL: " + e.getMessage());  
        }  
        
        //InterruptedException
        try {  
            Thread.sleep(10);  
        } catch (InterruptedException e) {  
            System.out.println("Thread interrupted: " + e.getMessage());  
        }  
        
        // ParseException
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = "2023/01/01"; 

        try {
            Date date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }  
          

}
