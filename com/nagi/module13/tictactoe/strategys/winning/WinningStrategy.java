package com.nagi.module13.tictactoe.strategys.winning;

import com.nagi.module13.tictactoe.models.Board;
import com.nagi.module13.tictactoe.models.Move;

public interface WinningStrategy {


    public abstract boolean checkIfWon(Board board, Move move);
    
}
