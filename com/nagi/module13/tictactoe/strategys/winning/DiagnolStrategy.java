package com.nagi.module13.tictactoe.strategys.winning;

import com.nagi.module13.tictactoe.models.Board;
import com.nagi.module13.tictactoe.models.Cell;
import com.nagi.module13.tictactoe.models.Move;

public class DiagnolStrategy implements WinningStrategy {

    @Override
    public boolean checkIfWon(Board board, Move move) {
        int count = 0;
        int boardsize = board.getDimension();
        for(int i= 0; i<board.getDimension(); i++){
            Cell cell = Board.getCells().get(i).get(i); // to check diagnol from topleft to bottom right
            if (cell.getPlayer() != null && cell.getPlayer().getSymbol() == move.getPlayer().getSymbol()){
                count = count + 1;
            }
        }
        if (count == boardsize){
            return true;
        }

        count = 0;
        for(int i= 0; i<board.getDimension(); i++){
            Cell cell = Board.getCells().get(i).get(boardsize-i-1); // to check diagnol from top right to bottom left
            if (cell.getPlayer() != null && cell.getPlayer().getSymbol() == move.getPlayer().getSymbol()){
                count = count + 1;
            }
        }

        if (count == boardsize){
            return true;
        }



        return false;
    }
    
}
