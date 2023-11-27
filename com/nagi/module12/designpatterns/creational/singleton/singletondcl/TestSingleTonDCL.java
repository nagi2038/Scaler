package com.nagi.module12.designpatterns.creational.singleton.singletondcl;

public class TestSingleTonDCL implements Runnable{

    public void run(){
        System.out.println(SingletonDCL.getInstance().hashCode());
    }
    
}
