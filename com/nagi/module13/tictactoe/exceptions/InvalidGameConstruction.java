package com.nagi.module13.tictactoe.exceptions;

public class InvalidGameConstruction extends Exception{

    private String message;

    public InvalidGameConstruction(){

    }
    
    public InvalidGameConstruction(String message){
        super(message);
    }
}
