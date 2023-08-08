package com.nagi.module11.i31introtoprocessandthreads.numberprinter;

public class Client {

    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        Thread thread = new Thread(numberPrinter);
        thread.start();
        System.out.println("I'm running on " + Thread.currentThread().getName());
        // thread.start(); //you can not call same thread again
    }
    
}
