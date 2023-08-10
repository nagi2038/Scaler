package com.nagi.module11.i32executorcallable.mergesort;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        
        List<Integer> array =  Arrays.asList(4,2,1,5,9,21,5,12,34,56);

        // ExecutorService service = Executors.newFixedThreadPool(10);


        /*
         * LIVE LOCK : can happen if no of threads are not given correctly.
         * solution : New cache thread pool
         * It will also reuse the threads but it won't have upperlimit.
         * but max time out for thread is 60secs for new cache threadpool
         */

         ExecutorService service1 = Executors.newCachedThreadPool();
        NewMergeSort mege = new NewMergeSort(array, service1);

        // MergeSort list = new MergeSort(array);
        // Future<List<Integer>> future = service.submit(list);

        /*
         * Independent task should be moved to new thread.
         */
        

        Future<List<Integer>> future1 = service1.submit(mege);


        try {
            System.out.println(future1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
            service1.shutdown();  
        } catch (ExecutionException e) {
            e.printStackTrace();
            service1.shutdown();
        }
        finally{
            service1.shutdown();
        }

        }


    }
