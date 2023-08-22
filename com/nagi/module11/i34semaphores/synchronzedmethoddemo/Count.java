package com.nagi.module11.i34semaphores.synchronzedmethoddemo;

public class Count {

    private int num = 0;

    public synchronized void  incrementVal(int offset){
        this.num += offset;

    }

    public synchronized void decrementVal(int offset){
        this.num -= offset;
    }

    public int getVal(){
        return this.num;
    }
    
}
