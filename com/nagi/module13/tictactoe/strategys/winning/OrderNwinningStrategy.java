package com.nagi.module13.tictactoe.strategys.winning;

import java.util.Arrays;
import java.util.List;

import com.nagi.module13.tictactoe.models.Board;
import com.nagi.module13.tictactoe.models.Move;

public class OrderNwinningStrategy implements WinningStrategy{

    
    private List<WinningStrategy> strategies  =  Arrays.asList(
        new ColmunStrategy(), 
        new Rowstrategy(),
        new DiagnolStrategy()
        );

    @Override
    public boolean checkIfWon(Board board, Move move) {
        for (WinningStrategy winningStrategy : strategies) {
            if(winningStrategy.checkIfWon(board, move)){
                return true;
            }
            
        }
        return false;
    }
    
}
