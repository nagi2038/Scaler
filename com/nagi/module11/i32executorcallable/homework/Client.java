package com.nagi.module11.i32executorcallable.homework;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        RandomNumberPrinter rnp = new RandomNumberPrinter();
        ArrayList<Future<Integer>> farray = new ArrayList<>();

        for (int i = 0; i<12; i++)
        {// adding all future objects to array list
            farray.add(service.submit(rnp));
            System.out.println("Submitting the request.");
        }

        try {
            Thread.sleep(20000);
            System.out.println("Main thread is sleeping for 10 secs");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
         * NOTE : if thread never complete the task it will not release it resource 
         * or give chance to other thread to perform
         * So, give correct size of ThreadPolling
         */
        for (Future<Integer> future : farray) {
            // calling get method on future object
            try {   
                System.out.println("****************** GET CALL STARTS ****************");
                int val = future.get();  
                System.out.println("Returned value : " + val);           
            } catch (Exception e) {
                // you can handle file condition here.
                System.out.println("Error in Code");
            } 
        }
        service.shutdown();
}
}
/*
 * In above code I have sumbited 12 request
 * And i have threadpool size of 3
 * so, first 3 request are executed, since i have only threadpool size of 3
 * and wait for get call 
 */