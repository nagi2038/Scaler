package com.nagi.module13.tictactoe.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nagi.module13.tictactoe.strategys.winning.ColmunStrategy;
import com.nagi.module13.tictactoe.strategys.winning.DiagnolStrategy;
import com.nagi.module13.tictactoe.strategys.winning.Rowstrategy;
import com.nagi.module13.tictactoe.strategys.winning.WinningStrategy;


public class Board {

    private static List<List<Cell>> cells; // make attributes as private.
    private int dimension;
    private List<WinningStrategy> strategies;

    public Board (int dimension){
        this.dimension = dimension;
        Board.setBorad(dimension);
        this.strategies = Arrays.asList(
                                        new ColmunStrategy(), 
                                        new Rowstrategy(),
                                        new DiagnolStrategy()
                                        );
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

    public void displayBoard(){
        for(int i = 0 ; i < dimension; i++){
            System.out.print("|");
            for(int j = 0 ; j < dimension; j++){
                Cell cell = cells.get(i).get(j);
                if (cell.getCellstate().equals(CellState.EMPTY)){
                    System.out.print(" _ ");
                }
                else{
                    System.out.print(" "+cell.getPlayer().getSymbol()+" ");
                }


            }
            System.out.println("|");
        }
    }

    public Cell setPlayer(Player player, int row, int col) {
        Cell cell = cells.get(row).get(col);
        // TODO check is cell set or not
        cell.setPlayer(player);
        cell.setCellstate(CellState.OCCUPIED);
        return cell;
    }

    public int getDimension() {
        return dimension;
    }

    public static List<List<Cell>> getCells() {
        return cells;
    }

    public boolean isdraw() {
        for (List<Cell> list : cells) {
            for (Cell cell : list) {
                if (cell.getCellstate() == CellState.EMPTY){
                    return false;
                }
            }
            
        }
        return true;
    }

    public boolean iswon(Board board , Move move) {
        for (WinningStrategy winningStrategy : strategies) {
            if(winningStrategy.checkIfWon(board, move)){
                return true;
            }
            
        }
        return false;
    }

    public void emptyCells(){
        for (List<Cell> row : cells) {
            for (Cell cell : row) {
                cell.removePlayer();
            }
        }
    }
    
}
