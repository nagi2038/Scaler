package com.nagi.module11.i32executorcallable.homework;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberPrinter implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("Number Generated "+ number + " Sleeping Now.");
        Thread.sleep(1000*number);
        System.out.println("Running on Thread : " + Thread.currentThread().getName());
        return number;
    }
    
}
