package com.training.oops;

/* Access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.
 * Private: The access level of a private modifier is only within the class. 
 * It cannot be accessed from outside the class.
 * Default: The access level of a default modifier is only within the package. 
 * It cannot be accessed from outside the package. 
 * If you do not specify any access level, it will be the default.
 * Protected: The access level of a protected modifier is within the package and outside the package through child class. 
 * If you do not make the child class, it cannot be accessed from outside the package.
 * Public: The access level of a public modifier is everywhere. 
 * It can be accessed from within the class, outside the class, within the package and outside the package.*/

//Class with different access modifiers
public class AccessModifier {
 public int publicVar;         // Public variable
 private int privateVar;       // Private variable
 protected int protectedVar;   // Protected variable
 int defaultVar;               // Default variable

 AccessModifier(int var) {
     this();
     this.privateVar = var;
     this.defaultVar = var;
     this.protectedVar = var;
     this.publicVar = var;
     System.out.println("Default Constructor");
 }
 
 // Constructor with different access modifiers
 private AccessModifier() {
     System.out.println("Private Constructor");
 }

 

 // Methods with different access modifiers
 
 public void publicMethod() {
     System.out.println("Public Method");
 }
 
 private void privateMethod() {
     System.out.println("Private Method");
 }
 
 protected void protectedMethod() {
     System.out.println("Protected Method");
 }

 void defaultMethod() {
     System.out.println("Default Method");
 }

 // Main method to demonstrate access modifiers
 public static void main(String[] args) {
	 AccessModifier obj = new AccessModifier(10);

     // Accessing methods and variables
     //obj.privateMethod();  // Error: privateMethod() has private access in AccessModifier
     obj.defaultMethod();    // Accessible
     obj.protectedMethod();  // Accessible
     obj.publicMethod();     // Accessible

     // Accessing variables directly
     // System.out.println(obj.privateVar);  // Error: privateVar has private access in AccessModifier
     System.out.println(obj.defaultVar);    // Accessible
     System.out.println(obj.protectedVar);  // Accessible
     System.out.println(obj.publicVar);     // Accessible
 }
}
