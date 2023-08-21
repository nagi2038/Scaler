package mutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    Count count;
    Lock lock;
     
    public Subtractor(Count count, Lock lock){
        this.count =count;
        this.lock = lock;
    }

    @Override
    public void run(){
        for(int i = 0 ; i<100; i++)
        lock.lock();
        this.count.num--;
        // System.out.println(this.count.num);
        lock.unlock();
    }
    
}
