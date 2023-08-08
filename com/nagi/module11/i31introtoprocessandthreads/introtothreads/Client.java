package com.nagi.module11.i31introtoprocessandthreads.introtothreads;

public class Client {
    public static void main(String[] args) {
        /*
         * 1. create a class 
         * 2. implement runnable for the classs
         * 3. create an object of runnable class in main/client class
         * 4. pass the runnable object to thread as parameter
         * 5. call function start()
         */
        BasicThread basicThread = new BasicThread();
        Thread thread = new Thread(basicThread);
        thread.start();

        System.out.println("I'm running on thread "+Thread.currentThread().getName());


    }
    
}
