package com.training.oops;

/* super keyword is used to access methods of the parent class while this is used to access methods of the current class.
 * Visibility: this refers to the current object instance, while super refers to the superclass of the current object instance.
 * Context: this is used within the current class scope to refer to its own members, while super is used to access superclass members.
 * Constructors: this() invokes another constructor of the same class, while super() invokes a constructor of the superclass.
 * */

//Parent class
class Laptop {
 String brand;

 // Constructor of the Laptop class
 Laptop(String brand) {
     this.brand = brand;
 }

 void displayInfo() {
     System.out.println("Brand: " + brand);
 }
}

//Child class inheriting from Laptop
class GamingLaptop extends Laptop {
 String graphicsCard;

 // Constructor of the GamingLaptop class
 GamingLaptop(String brand, String graphicsCard) {
     super(brand);  // Calling the constructor of the superclass
     this.graphicsCard = graphicsCard;
 }

 @Override
 void displayInfo() {
     super.displayInfo();  // Calling the method of the superclass
     System.out.println("Graphics Card: " + graphicsCard);
 }
}

//Main class to run the program
public class ThisAndSuper {
 public static void main(String[] args) {
     GamingLaptop myLaptop = new GamingLaptop("MSI", "NVIDIA GeForce RTX 3080");
     myLaptop.displayInfo();
 }
}
