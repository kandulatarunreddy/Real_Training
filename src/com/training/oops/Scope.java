package com.training.oops;

public class Scope {

    // Instance variable (Instance Scope)
    int instanceVar = 10;

    // Static variable (Static/Class Scope)
    static int staticVar = 20;

    public void LocalScope() {
        // Local variable (Local Scope)
        int localVar = 30;
        System.out.println("Local variable: " + localVar);
    }

    public void InstanceScope() {
        System.out.println("Instance variable: " + instanceVar);
    }

    public static void StaticScope() {
        System.out.println("Static variable: " + staticVar);
    }

    public void BlockScope() {
        for (int i = 0; i < 2; i++) {
            // Block variable (Block Scope)
            int blockVar = i * 10;
            System.out.println("Block variable inside loop iteration " + i + ": " + blockVar);
        }
    }

    public static void main(String[] args) {
        Scope example = new Scope();

        // Demonstrating local scope
        example.LocalScope();

        // Demonstrating instance scope
        example.InstanceScope();

        // Demonstrating static scope
        //Static methods can access static variables and other static methods directly using the class name.
        Scope.StaticScope();

        // Demonstrating block scope
        example.BlockScope();
    }
}

