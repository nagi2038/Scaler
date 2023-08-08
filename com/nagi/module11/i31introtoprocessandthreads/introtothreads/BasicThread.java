package com.nagi.module11.i31introtoprocessandthreads.introtothreads;

public class BasicThread  implements Runnable{

    @Override
    public void run() {
        System.out.println("I'm running on thread "+ Thread.currentThread().getName());
    }
    
}
