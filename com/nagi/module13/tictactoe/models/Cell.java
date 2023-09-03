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

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Player getPlayer() {
        return player;
    }

    public CellState getCellstate() {
        return cellstate;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setCellstate(CellState cellstate) {
        this.cellstate = cellstate;
    }
    
    public void removePlayer(){
        player = null;
         cellstate = CellState.EMPTY;
    }
}
