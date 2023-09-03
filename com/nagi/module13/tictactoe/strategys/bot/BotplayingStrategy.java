package com.nagi.module13.tictactoe.strategys.bot;

import com.nagi.module13.tictactoe.models.Board;
import com.nagi.module13.tictactoe.models.Move;
import com.nagi.module13.tictactoe.models.Player;

public interface BotplayingStrategy {
    
    Move makeMove(Board board , Player player);
}
