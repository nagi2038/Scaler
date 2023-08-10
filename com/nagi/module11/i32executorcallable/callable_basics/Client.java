package com.nagi.module11.i32executorcallable.callable_basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        RandomNumberGenerator rg = new RandomNumberGenerator();
        Future<Integer> future = service.submit(rg);
        Future<Integer> future1 = service.submit(rg);
        try {
            System.out.println("Now waiting for task to complete");
            int num = future.get();
            int num2 = future1.get();
            System.out.println("Recived " + num + " From Thread Pool");
            System.out.println("Recived " + num2 + " From Thread Pool");
        } catch (Exception e) {
            System.out.println("Error in getting nuber");
        }
        service.shutdown();
    }
    
}
