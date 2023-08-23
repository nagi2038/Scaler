package com.nagi.module11.i35collectionsandgenrics.genericdemo;

public class Client {

    public static void main(String[] args) {
        
        Printer<Integer> printer = new Printer<>(23);
        printer.print();
        Printer<Double> printer2 = new Printer<Double>(2.995);
        printer2.print();
    }
    
}
