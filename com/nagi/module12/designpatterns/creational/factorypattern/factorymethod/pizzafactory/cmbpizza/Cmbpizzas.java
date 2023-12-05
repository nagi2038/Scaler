package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.cmbpizza;

import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.Pizza;
import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.PizzaStore;

public class Cmbpizzas extends PizzaStore{

    @Override
    protected Pizza createPizza(String pizzaName) {
       if (pizzaName.equalsIgnoreCase("cheese")){
        return new CheesePizzaCmb();
       }
       else if ( pizzaName.equalsIgnoreCase("pepperoni")){
        return new PepperoniPizzaCmb();
       }
       else {
         return null;
       }
    }
    
}
