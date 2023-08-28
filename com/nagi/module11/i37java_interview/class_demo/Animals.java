package com.nagi.module11.i37java_interview.class_demo;

public final class Animals { // <- if you make a class final, you cannot do inheritance.
    
    public int legs;

    public void eat(){
        System.out.println("Animal is eating");
    }
}

// class Dog extends Animals{

//     // we can over ride the methods

// }