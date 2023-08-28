package com.nagi.module11.i37java_interview.method_demo;

public  class Animals { 
    
    public int legs;

    public final void eat(){ // Child class cannot override the method.
        System.out.println("Animal is eating");
    }
}

class Dog extends Animals{

    // @Override
    // public void eat(){
    //     System.out.println("Dog is eating");
    // }
}