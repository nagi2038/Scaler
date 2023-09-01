package com.nagi.module13.tictactoe.strategys.winning;

import com.nagi.module13.tictactoe.models.Board;
import com.nagi.module13.tictactoe.models.Cell;
import com.nagi.module13.tictactoe.models.Move;

public class ColmunStrategy implements WinningStrategy{

    @Override
    public  boolean checkIfWon(Board board, Move move) {
        int count = 0;
        int col = move.getCell().getCol();

        for(int i= 0; i<board.getDimension(); i++){
            Cell cell = Board.getCells().get(i).get(col);
            if (cell.getPlayer() != null && cell.getPlayer().getSymbol() == move.getPlayer().getSymbol()){
                count = count + 1;
            }
            else{
                return false;
            }

        }
        return true;
    }
    
}
