package com.training.oops.packageB;

import com.training.oops.packageA.accessprotected;

/*The protected access modifier is accessible within package and outside the package but through inheritance only.
 * The protected access modifier can be applied on the data member, method and constructor. 
 * It can't be applied on the class.
 * It provides more accessibility than the default modifer. 
 * */

public class Accessprotected extends accessprotected{  
	  public static void main(String args[]){  
		  Accessprotected obj = new Accessprotected();  
		   obj.msg();    
	  }  
	}  