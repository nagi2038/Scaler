package com.nagi.module13.tictactoe.models;

public class Cell {
    
    private int row;
    private int col;
    private Player player;
    private CellState cellstate;

    public Cell(int row , int col , CellState cellState){
        this.row = row;
        this.col = col;
        this.cellstate = cellState;
        this.player = null; // explicit 
    }

}
