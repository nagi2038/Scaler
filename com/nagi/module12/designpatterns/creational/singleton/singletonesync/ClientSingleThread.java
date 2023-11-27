package com.nagi.module12.designpatterns.creational.singleton.singletonesync;

class ClientSingleThread {

    public static void main(String[] args) {
        for ( int i = 0 ; i < 100; i ++){
            System.out.println(SingleTonsync.getInstance().hashCode());
        }
    }
    
}
