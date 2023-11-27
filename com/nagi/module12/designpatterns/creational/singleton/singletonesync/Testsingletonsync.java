package com.nagi.module12.designpatterns.creational.singleton.singletonesync;

public class Testsingletonsync implements Runnable {

    public void run(){
        System.out.println(SingleTonsync.getInstance().hashCode());
    }
    
}
