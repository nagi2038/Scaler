package com.nagi.module11.i36exception_reflections_annotations.exception_demo;

import java.io.FileNotFoundException;


public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        // readFile2();
        // readFile(); // we can throws the exception - entire program dies
        // we can handle the exception. using try catch bolck

        String s = null;
        print(s);
        
    }

    // public static void readFile()throws FileNotFoundException{
    //     FileReader file = new FileReader("scaler.txt");
    // }

    // public static void readFile2(){
    //     try{
    //         FileReader fr = new FileReader("scaler.txt");
    //     }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }
        
    // }

    public static void print(String s){
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
         
        /*
        we will get nullpointexception [RUNTIME] if we pass null in s 
        so, it don't ask for to handle the exception.
         */ 

         

    }
    


    
}
