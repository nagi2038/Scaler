package com.nagi.module12.designpatterns.creational.singleton.singletonesync;

public class SingleTonsync {

    private static SingleTonsync sync;

    private SingleTonsync(){};

     synchronized static SingleTonsync  getInstance(){
        if (sync == null){
            sync = new SingleTonsync();
        }
        return sync;
    }
    
}
