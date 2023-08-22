package com.nagi.module11.i34semaphores.homework;

public class Producer implements Runnable{

    Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        for(int i = 0 ; i<100; i++){
            this.store.addItem();
        }

    }

    
    
}
