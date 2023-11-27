package com.nagi.module12.designpatterns.creational.singleton.singletondcl;

public class ClientsingleThread {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        for(int i= 0 ; i< 100; i++){
            System.out.println(SingletonDCL.getInstance().hashCode());
        }
        long endTime = System.nanoTime();
        System.out.println((endTime-startTime)/1000);
    }
    
}
