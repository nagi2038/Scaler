package com.nagi.module13.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.border.Border;

public class Board {

    private static List<List<Cell>> cells; // make attributes as private.

    public Board (int dimension){
        Board.setBorad(dimension);
    }

    private static void setBorad (int dimension){
        cells = new ArrayList<>();
        for (int i =0 ; i< dimension; i++){
            ArrayList<Cell> row = new ArrayList<>();
            for(int j = 0 ; j<dimension ; j++){
                row.add(new Cell(i,j , CellState.EMPTY));
            }
            cells.add(row);
        }
    }
}
