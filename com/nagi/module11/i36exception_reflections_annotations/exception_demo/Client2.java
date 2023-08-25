package com.nagi.module11.i36exception_reflections_annotations.exception_demo;

public class Client2 {
    public static void main(String[] args) {
        int num = 26;
        try {
            call(num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        

    public static void call(int num) throws Exception{

        if (num > 25){
            throw new MyCustomException("Number is greater than 25 "); 
            /*
             * since this is checked exception we need to handle it.
             * always go for checked exception.
             * 
             */
        }
        System.out.println("Every thing is good ");
    }
}
