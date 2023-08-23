package com.nagi.module11.i35collectionsandgenrics.advancegenrics;

public class Printer<T extends Animal> {

    T animal;

    public Printer(T animal){
        this.animal = animal;
    }

    public void print(){
        animal.walk();  
        //we will get compiler error 
        //since T is open to all data type and we don't have walk for every object.
        // make extends to animals

        System.out.println(animal.toString());
    }
}
