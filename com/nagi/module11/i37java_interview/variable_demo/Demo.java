package com.nagi.module11.i37java_interview.variable_demo;

public class Demo {

    public static void main(String[] args) {
        final int i ;
        i = 10;
        System.out.println(i);

        // i = 13; // Not allowed to change the variable value once assinged.
    }
    
}


class Animals{
    final String name; // by default it will assgin with null so we need to make constructor for this.
    final int legs;

    // construtor is manditory
    public Animals(String name , int legs){
        this.name = name;
        this.legs = legs;
    }

    /*
     * we can not add setter since, we can not assign values multiple times for final variable
     * 
     */

}