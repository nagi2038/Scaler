package com.nagi.module11.i34semaphores.homework;

import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        
        Semaphore producerSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

       Store store = new Store( producerSemaphore, consumerSemaphore);

       Producer producer = new Producer(store);
       Consumer consumer = new Consumer(store);

       Thread t1 = new Thread(producer);
       Thread t2 = new Thread(consumer);

       t1.start();
       t2.start();

       t1.join();
       t2.join();

       System.out.println(store.getVal());
    }
    
}
