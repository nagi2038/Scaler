package com.nagi.module11.i34semaphores.homework;

import java.util.concurrent.Semaphore;

public class Store {

    private static int num = 0;
    Semaphore proudce, consumer;
    Store store;

    public Store( Semaphore produce , Semaphore consumer){
        this.proudce = produce;
        this.consumer = consumer;
    }

    public void addItem() {
        try {
            this.proudce.acquire();
            Store.num += 1;
            this.consumer.release();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void buyItem() {
        try {
            this.consumer.acquire();
            Store.num -= 1;
            this.proudce.release();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
    }

    public int getVal(){
        return Store.num;
    }
    
}
