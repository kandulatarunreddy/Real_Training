package com.training.exception;

class ChildThread extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        	System.err.println("InterruptedException caught!: " + e.getMessage());
        }
    }
}
public class InteruptedException {
    public static void main(String[] args) 
      throws InterruptedException {
        ChildThread childThread = new ChildThread();
        childThread.start();
        childThread.interrupt();
    }
}