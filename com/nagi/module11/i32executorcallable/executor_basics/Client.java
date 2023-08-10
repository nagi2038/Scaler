package com.nagi.module11.i32executorcallable.executor_basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        // below code will create new thread for every iterations 
        /*
         * CONS :
         * no reuse of thread 
         * too much of ram usage because of creating and scheduleing new thread every time
         * system may exhaust it's resource 
         */

         /* 
          uncommetn below code and try out
        for(int i = 0 ; i<20; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
        */

        ExecutorService service =  Executors.newFixedThreadPool(5);
        // can we create object of Executors? NO => construtor is private. but, we can call static method of that class.
        
        for(int i = 0 ; i<20; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            service.execute(numberPrinter);
            /*
             * NOTE:
             * even if increase no of requests [iteration]
             * here thread reuse is happing which consume less resoureces
             * 
             * and OUTPUT is not in order 1,2,3..
             * because thread are scheduled as per OS
             */
        }
        service.shutdown(); // YOU need to shut down the service to end the program
    }
    
}
