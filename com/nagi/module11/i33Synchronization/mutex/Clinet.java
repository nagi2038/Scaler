package mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clinet {

    public static void main(String[] args) {
        Count count = new Count();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        System.out.println(adder.count.num);
        System.out.println(subtractor.count.num);
        System.out.println(count.num);
      
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try{
            t2.join();
        }

        catch(Exception e){
            e.getMessage();
        }
            
       

    
         
    }
    
}
