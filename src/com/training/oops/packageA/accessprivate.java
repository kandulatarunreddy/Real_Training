package com.training.oops.packageA;

/*The private access modifier is accessible only within the class.*/
public class accessprivate { 
	private void msg(){System.out.println("Hello from private");} 
	
	 public static void main(String args[]){  
		 accessprivate obj=new accessprivate();
		 obj.msg();
		 }  
}
