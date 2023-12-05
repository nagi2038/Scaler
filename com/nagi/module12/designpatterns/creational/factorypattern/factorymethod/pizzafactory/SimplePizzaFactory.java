package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String pizzaName){
        if (pizzaName.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }
        else if (pizzaName.equalsIgnoreCase("pepperoni")){
            return new PepperoniPizza();
        }
        else{
            return null;
        }
    }
    
}
