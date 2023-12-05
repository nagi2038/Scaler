package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.nykpizza;

import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.Pizza;

public class CheesePizzaNYK implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese NYK Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese NYK Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese NYK Pizza");
    }

    @Override
    public void box() {
        System.out.println("Packed Cheese NYK Pizza");
    }
    
}
