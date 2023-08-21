package mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count ;
    Lock lock;
    
   public Adder(Count count , Lock lock){
    this.count = count;
    this.lock = lock;

   }

   @Override
   public void run(){
    for(int i = 0 ; i<100; i++)
    lock.lock();
    this.count.num++; // critical section. only should placed in lock so, that it will run non CS(critical session) part
    // System.out.println(this.count.num);
    lock.unlock();
   }
    
}
