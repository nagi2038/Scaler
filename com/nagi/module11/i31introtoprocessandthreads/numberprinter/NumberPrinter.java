package com.nagi.module11.i31introtoprocessandthreads.numberprinter;

public class NumberPrinter implements Runnable {
    

    @Override
    public void run(){
        for(int i = 0; i< 100 ; i++)
        {
            System.out.println(i+1);
        }
        
    }
}
