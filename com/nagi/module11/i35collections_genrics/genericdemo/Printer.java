package com.nagi.module11.i35collections_genrics.genericdemo;

public class Printer<T> {

    T thingToPrint ;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
    
}
