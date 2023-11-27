package com.nagi.module12.designpatterns.creational.singleton.singletondcl;

public class SingletonDCL {
    private static SingletonDCL singletondcl;

    private SingletonDCL(){};

    public static SingletonDCL getInstance(){
        if (singletondcl == null){
            synchronized(SingletonDCL.class){
                if (singletondcl == null){
                    singletondcl = new SingletonDCL();
                }
            }
        }
        return singletondcl;
    }
    
}
