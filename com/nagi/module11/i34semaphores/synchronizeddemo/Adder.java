package com.nagi.module11.i34semaphores.synchronizeddemo;

public class Adder implements Runnable{

    Count c;

    public Adder(Count c){
        this.c = c;
    }
    @Override
    public void run(){
        for(int i = 0 ; i<1000; i++){
            synchronized(this.c){
                this.c.num++;
            }
        }
    }
    
}
