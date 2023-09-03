package com.nagi.module13.tictactoe.models;


import com.nagi.module13.tictactoe.factory.bot.BotplayingStrategyFactory;
import com.nagi.module13.tictactoe.strategys.bot.BotplayingStrategy;

public class Bot extends Player {

    private BotplayingStrategy strategy;
    
    public Bot(String name, Character symbol , BotLevel botLevel){
        super(name,symbol);
        this.strategy = BotplayingStrategyFactory.getStrategy(botLevel);
    }

    @Override
    public Move makeMove(Board board){

        // Scanner scanner = new Scanner(System.in);
        System.out.println(getName() + "'s trun");

        return strategy.makeMove(board, this);

    }
    
}
