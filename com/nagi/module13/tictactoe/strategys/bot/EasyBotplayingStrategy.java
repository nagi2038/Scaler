package com.nagi.module13.tictactoe.strategys.bot;

import java.util.List;

import javax.swing.border.Border;

import com.nagi.module13.tictactoe.models.Board;
import com.nagi.module13.tictactoe.models.Cell;
import com.nagi.module13.tictactoe.models.CellState;
import com.nagi.module13.tictactoe.models.Move;
import com.nagi.module13.tictactoe.models.Player;

public class EasyBotplayingStrategy implements BotplayingStrategy{

    @Override
    public Move makeMove(Board board , Player palyer) {
        Cell moveCell = null;
        outer: for(List<Cell> row : Board.getCells()){
            for(Cell cell : row){
                if (cell.getCellstate() == CellState.EMPTY){
                    moveCell = cell;
                    break outer;

                }
            }
        }

    board.setPlayer(palyer, moveCell.getRow(), moveCell.getCol());
    return new Move(palyer, moveCell);
        
    }
    
}
