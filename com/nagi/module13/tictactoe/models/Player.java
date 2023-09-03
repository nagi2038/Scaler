package com.nagi.module13.tictactoe.models;

import java.util.Scanner;

public class Player {

    protected String name;
    protected Character symbol; 

    public Player(String name , Character symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public Character getSymbol() {
        return symbol;
    }
    
    public Move makeMove(Board board ){
        // Input row and col from user on board
        // validation we can make move or not.
        Scanner scanner = new Scanner(System.in);
        System.out.println(getName() + "'s trun, give row and col");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        Cell cell = board.setPlayer(this, row, col);
        Move move = new Move(this,cell);
        return move;
    }
    
}
