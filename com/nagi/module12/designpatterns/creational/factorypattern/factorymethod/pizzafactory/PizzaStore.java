package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory;

public abstract class PizzaStore {

    Pizza pizza;
    void orderpizza(String pizzaName){
        pizza = createPizza(pizzaName);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
    }

    protected abstract Pizza createPizza(String pizzaName);
    
}

