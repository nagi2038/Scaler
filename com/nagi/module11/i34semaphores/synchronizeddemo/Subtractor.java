package com.nagi.module11.i34semaphores.synchronizeddemo;

public class Subtractor implements Runnable{

    Count c;

    public Subtractor(Count c){
        this.c = c;
    }
    
    @Override
    public void run(){
        for(int i = 0 ; i< 1000; i++){
            synchronized(this.c){
                // we need to pass object to synchronized
                // this is similar to lock and unlock.
                this.c.num--;
            }
            
            
        }
    }
}
