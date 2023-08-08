package com.nagi.module11.i32executorcallable.executor_basics;

public class NumberPrinter implements Runnable{

    int num;

    public NumberPrinter(int num){
        this.num = num;
    }

    @Override
    public void run(){
        System.out.println("Printing "+this.num + " from Thread " + Thread.currentThread().getName());

    }
    
}
