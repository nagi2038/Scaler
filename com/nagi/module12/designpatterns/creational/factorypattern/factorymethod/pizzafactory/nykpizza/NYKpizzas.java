package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.nykpizza;

import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.Pizza;
import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.PizzaStore;

public class NYKpizzas extends PizzaStore{

    @Override
    protected Pizza createPizza(String pizzaName) {
        if (pizzaName.equalsIgnoreCase("cheese")){
        return new CheesePizzaNYK();
       }
       else if ( pizzaName.equalsIgnoreCase("pepperoni")){
        return new PepperoniPizzaNYK();
       }
       else {
         return null;
       }
    }
}
