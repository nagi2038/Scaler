package com.nagi.module13.tictactoe.factory.bot;

import com.nagi.module13.tictactoe.models.BotLevel;
import com.nagi.module13.tictactoe.strategys.bot.BotplayingStrategy;
import com.nagi.module13.tictactoe.strategys.bot.EasyBotplayingStrategy;

public class BotplayingStrategyFactory {

    public static BotplayingStrategy getStrategy(BotLevel level){
        if (level == BotLevel.LOW)
        return new EasyBotplayingStrategy();
        else if (level == BotLevel.MEDIUM)
        return new EasyBotplayingStrategy();

        return new EasyBotplayingStrategy();

    }
    
}
