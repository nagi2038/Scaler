package com.nagi.module11.i31introtoprocessandthreads.numberprinter;

public class NumberPrinter implements Runnable {
    

    @Override
    public void run(){
        for(int i = 0; i< 100 ; i++)
        {
            if(i == 4)
            {
                
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            System.out.println("I'm from new thread");
        }
        
    }
}
