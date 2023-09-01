package com.nagi.module13.tictactoe.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    private List<WinningStrategy> strategies;

    public Game(GameBuilder gameBuilder){
        this.players = gameBuilder.players;
        this.board = gameBuilder.board;
        this.gameStatus = gameBuilder.gameStatus;
        this.moves = gameBuilder.moves;
        this.currentPlayer = gameBuilder.currentPlayer;
        this.strategies = Arrays.asList(
                                        new ColmunStrategy(), 
                                        new Rowstrategy(),
                                        new DiagnolStrategy()
                                        );
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

    public boolean makeMove(Player player, int row, int col) {
        Cell cell = this.board.setPlayer(player , row , col);
        Move move = new Move(player , cell);
        this.moves.add(move);
        // System.out.printf("%d player \n" , this.currentPlayer);
        this.currentPlayer = (this.currentPlayer + 1)%(this.board.getDimension()-1);
        // System.out.println("current Player index : "+this.currentPlayer);
        return this.iswon(move);

    }

    private  boolean iswon(Move move){

        for (WinningStrategy winningStrategy : strategies) {
            if(winningStrategy.checkIfWon(board, move)){
                this.gameStatus = GameStatus.ENDED;
                return true;
            }
            
        }
        return false;

    }
}