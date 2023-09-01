package com.nagi.module13.tictactoe.models;

public class Bot extends Player {

    private BotLevel botlevel;
    
    public Bot(String name, Character symbol , BotLevel botLevel){
        super(name,symbol);
        this.botlevel = botLevel;
    }
    
}
