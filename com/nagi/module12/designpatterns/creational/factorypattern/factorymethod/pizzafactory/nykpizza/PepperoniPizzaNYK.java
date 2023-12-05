package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.nykpizza;

import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.Pizza;

public class PepperoniPizzaNYK implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni NYK Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni NYK Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni NYK Pizza");
    }

    @Override
    public void box() {
        System.out.println("Packed Pepperoni NYK Pizza");
    }
    
}
