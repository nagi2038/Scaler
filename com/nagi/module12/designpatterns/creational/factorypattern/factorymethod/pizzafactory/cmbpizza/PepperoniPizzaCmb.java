package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.cmbpizza;

import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.Pizza;

public class PepperoniPizzaCmb implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Cmb Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Cmb Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Cmb Pizza");
    }

    @Override
    public void box() {
        System.out.println("Packed Pepperoni Cmb Pizza");
    }
    
}
