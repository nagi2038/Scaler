package com.nagi.module11.i34semaphores.concurrentdemo;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) throws Exception{
        AtomicInteger aint = new AtomicInteger(0);
        Adder adder = new Adder(aint);
        Subtractor subtractor = new Subtractor(aint);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(aint.get());
    }
}
