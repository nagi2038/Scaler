package com.nagi.module12.designpatterns.creational.prototype_registory;

public class IntelegentStudetn extends Student {

    private double iq;

    public IntelegentStudetn(int age, String name, String  email, int rollNo, double iq ){
        super(age, name, email, rollNo);
        this.iq  = iq;
    }

    public IntelegentStudetn(IntelegentStudetn intstd){
        super(intstd);
        this.iq = intstd.iq;
    }

    public IntelegentStudetn clone(IntelegentStudetn intstd){

        return new IntelegentStudetn(intstd);

    }
    
}
