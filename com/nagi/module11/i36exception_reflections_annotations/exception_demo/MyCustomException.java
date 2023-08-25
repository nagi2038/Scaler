package com.nagi.module11.i36exception_reflections_annotations.exception_demo;

public class MyCustomException extends Exception{

    public MyCustomException(String message){
        super(message);
    }

    public MyCustomException(){
        super();
    }

}
