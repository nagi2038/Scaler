package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.cmbpizza;

import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.Pizza;

public class CheesePizzaCmb implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese CMB Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese CMB Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese CMB Pizza");
    }

    @Override
    public void box() {
        System.out.println("Packed Cheese CMB Pizza");
    }
    
}
