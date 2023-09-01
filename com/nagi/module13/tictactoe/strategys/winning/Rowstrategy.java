package com.nagi.module13.tictactoe.strategys.winning;

import java.util.List;

import com.nagi.module13.tictactoe.models.Board;
import com.nagi.module13.tictactoe.models.Cell;
import com.nagi.module13.tictactoe.models.Move;

public class Rowstrategy implements WinningStrategy{

    @Override
    public boolean checkIfWon(Board board, Move move) {

        int row = move.getCell().getRow();
        List<Cell> listrow = Board.getCells().get(row);
        int count = 0;
        for (Cell cell : listrow) {
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
