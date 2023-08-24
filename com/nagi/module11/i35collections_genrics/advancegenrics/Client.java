package com.nagi.module11.i35collections_genrics.advancegenrics;

public class Client {
    public static void main(String[] args) {
        // Printer<String> str = new Printer<>("name");
        // str.print();

        Animal dog = new Dog();
        Printer<Animal> animal = new Printer<Animal>(dog);
        animal.print(); 
        shout("Scaler");

        String s = wrapmsg("Hello Nagi");
        System.out.println(s);
    }
    public static <T> void shout(T message){
        /*
         * generic for method 
         * with void return type
         * 
         */
        System.out.println(message + "!!!!");
    }

    public static <T> T wrapmsg(T message){
        /*
         * generic with generic return type
         * can we constrain input type in method too?
         */

        return message;
    }
}
