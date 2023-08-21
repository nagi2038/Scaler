package synchronizationdemo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        Count c = new Count();

        Adder add = new Adder(c);
        Subtractor sub = new Subtractor(c);
        
        // I'm using Executor service. we can do this using thread also
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(sub);
        service.execute(add);

        // service.close();  // wait for all srevice to complete but, no new threads will be created.


        System.out.println(sub.c.num);
        System.out.println(add.c.num);

        System.out.println(c.num);

        /*
         * one of sample output:
         * output is not same all the time.
         * Why values are not Zero?
         * 
         * -904
         * -1017
         * 331
         * 
         * Question : why all three values are differnet?
         * 
         * 
         * Hint : threads
         * 
         * 
         * Question : How to make all values are same?
         * 
         * 
         * Hint : wait until threads are done.
         */

         service.shutdown();


    }
    
}
