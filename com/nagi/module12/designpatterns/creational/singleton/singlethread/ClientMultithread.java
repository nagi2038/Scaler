package com.nagi.module12.designpatterns.creational.singleton.singlethread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClientMultithread {
    public static void main(String[] args) {
        ExecutorService service =  Executors.newFixedThreadPool(5);
        // create multiple threads
        long startTime = System.nanoTime();
        TestSingleTon testSingleTon = new TestSingleTon();
        for ( int i = 0 ; i < 100 ; i++){
            // for each all it runnable will call get instance method
            // TestSingleTon testSingleTon = new TestSingleTon();

            // service will execute each thread created
            service.execute(testSingleTon);

        }

        // to shutdown the service.
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
