package com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory;

import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.cmbpizza.Cmbpizzas;
import com.nagi.module12.designpatterns.creational.factorypattern.factorymethod.pizzafactory.nykpizza.NYKpizzas;

public class Client {

    public static void main(String[] args) {

        PizzaStore nyk = new NYKpizzas();
        nyk.orderpizza("cheese");

        System.out.println("\n\n");

        PizzaStore cmb = new Cmbpizzas();
        cmb.orderpizza("pepperoni");
        

    }
    
}
