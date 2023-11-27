package com.nagi.module12.designpatterns.creational.singleton.singlethread;


public class SingleThread{

    private static SingleThread singleton ;

    private SingleThread(){

    };

    public static SingleThread getInstance(){
        if (singleton == null){
            singleton = new SingleThread();
        }
        return singleton;
    }

}