package com.nagi.module12.designpatterns.creational.singleton.singletonesync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientMultiThread {
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        
        ExecutorService service =  Executors.newFixedThreadPool(5); 
        for ( int i = 0 ; i<100 ; i++){
            Testsingletonsync testsingletonsync = new Testsingletonsync();
            service.execute(testsingletonsync);
        }
        service.shutdown();
        try {
            service.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        
        System.out.println((endTime-startTime)/10000);
    }
    
}
