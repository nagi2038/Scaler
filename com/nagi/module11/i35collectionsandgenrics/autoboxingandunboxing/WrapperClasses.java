package com.nagi.module11.i35collectionsandgenrics.autoboxingandunboxing;

public class WrapperClasses {

    public static void main(String[] args) {
        int num = 3;
        Integer in = num; // autoboxing
        int xyz = in; // autounboxing


        // will wrapper num store in heap?
        System.out.println("Test : "+ xyz);

        //YES : in debug it got 
        /*
         * num : 3
         * in : Integer@9 - which means it stored in heap.
         * xyz : 3
         */
        
    }
    
}
