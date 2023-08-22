package com.nagi.module11.i34semaphores.synchronzedmethoddemo;


public class Client  {

    public static void main(String[] args) throws Exception {
        Count c = new Count();
        Adder add = new Adder(c);
        Subtractor subtractor = new Subtractor(c);

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(add.c.getVal());
        System.out.println(c.getVal());
    }
    
}
