package com.nagi.module11.i34semaphores.concurrentdemo;

import java.util.concurrent.atomic.AtomicInteger;

public class Subtractor implements Runnable{

    AtomicInteger aint;

    public Subtractor(AtomicInteger aint){
        this.aint = aint;
    }

    @Override
    public void run() {
       for(int i = 0; i<1000; i++)
       {
        aint.getAndDecrement();
       }
       
    }
    
}
