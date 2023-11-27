package com.nagi.module12.designpatterns.creational.singleton.singlethread;

public class TestSingleTon implements Runnable {



    @Override
    public void run() {
        System.out.println(SingleThread.getInstance().hashCode());
    }
    
}
