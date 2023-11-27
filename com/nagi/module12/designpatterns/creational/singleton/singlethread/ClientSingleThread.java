package com.nagi.module12.designpatterns.creational.singleton.singlethread;

public class ClientSingleThread {
    public static void main(String[] args) {
        
        for(int i =1 ; i< 100 ; i++){
            System.out.println(SingleThread.getInstance().hashCode()); 
        }
    }
    
}
