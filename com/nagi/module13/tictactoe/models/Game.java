package com.nagi.module13.tictactoe.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.nagi.module13.tictactoe.exceptions.InvalidGameConstruction;
import com.nagi.module13.tictactoe.strategys.winning.ColmunStrategy;
import com.nagi.module13.tictactoe.strategys.winning.DiagnolStrategy;
import com.nagi.module13.tictactoe.strategys.winning.Rowstrategy;
import com.nagi.module13.tictactoe.strategys.winning.WinningStrategy;

public class Game{
    private List<Player> players;
    private Board board;
    private GameStatus gameStatus;
    private int currentPlayer;
    private List<Move> moves;
    private List<WinningStrategy> strategies = Arrays.asList(
                                        new ColmunStrategy(), 
                                        new Rowstrategy(),
                                        new DiagnolStrategy()
                                        );

    public Game(GameBuilder gameBuilder){
        this.players = gameBuilder.players;
        this.board = gameBuilder.board;
        this.gameStatus = gameBuilder.gameStatus;
        this.moves = gameBuilder.moves;
        this.currentPlayer = gameBuilder.currentPlayer;
    }

    public static GameBuilder getBuilder(){
        return new GameBuilder();
    }

    

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getCurrentPlayer() {
        return this.players.get(currentPlayer);
    }

    public List<Move> getMoves() {
        return moves;
    }



    public static class GameBuilder{
        private List<Player> players;
        private Board board;
        private GameStatus gameStatus;
        private int currentPlayer;
        private List<Move> moves;

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }
        public GameBuilder setGameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }
        public GameBuilder setCurrentPlayer(int currentPlayer) {
            this.currentPlayer = currentPlayer;
            return this;
        }
        public GameBuilder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Game build() throws InvalidGameConstruction{

            if(this.players == null || this.players.size() <= 1){
                throw new InvalidGameConstruction("Atleast two players are required.");
            }
            // randomised the players
            Collections.shuffle(this.players);
            this.setBoard(new Board(this.players.size() + 1));
            return new Game(this);
        }




    }

    public GameStatus makeMove() {
        Player currentPlayer = getCurrentPlayer();
        Move move = currentPlayer.makeMove(board);
        Scanner scanner = new Scanner(System.in);
        this.moves.add(move);
        System.out.println("Move made as of now " + this.getMoves().size());
        // if (!(currentPlayer instanceof Bot)){
        //     System.out.println("Do you want to undo ? (y/n)");
        //     char option = scanner.next().toLowerCase().charAt(0);
        //     if(option == 'y'){
        //         undo();
        //         return GameStatus.IN_PROGRESS;
        //     }
        // }
        if (this.iswon(move)){
            return GameStatus.ENDED;
        }
        else if(this.isdraw()){
            return GameStatus.DRAW;
        }
        // System.out.printf("%d player \n" , this.currentPlayer);
        this.currentPlayer = (this.currentPlayer + 1)%(this.board.getDimension()-1);
        // System.out.println("current Player index : "+this.currentPlayer);
        
        return GameStatus.IN_PROGRESS;

    }

    public void rewatch(){
        board.emptyCells();
        for (Move move : this.getMoves()) {
            
            Cell cell = move.getCell();
            System.out.printf("move make on row %d and col %d \n\n", cell.getRow(), cell.getCol());
            cell.setPlayer(move.getPlayer());
            board.setPlayer(cell.getPlayer(), cell.getRow(), cell.getCol());
            board.displayBoard();
        }
        System.out.println("total moves made " +this.getMoves().size());
    }

    public void undo() {
        // update board
        Move lastmove = moves.remove(moves.size()-1);
        Cell cell = lastmove.getCell();
        cell.removePlayer();
        // remove that move from board list.

    }

    private  boolean iswon(Move move){
        boolean won = board.iswon(this.board , move);
        if (won){
            this.gameStatus = GameStatus.ENDED;  
        }
        return won;
        

    }

    private boolean isdraw(){

        boolean draw =  board.isdraw();
        if (draw){
            this.gameStatus = GameStatus.DRAW;
        }
        return draw;

    }
}