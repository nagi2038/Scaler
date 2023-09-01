package com.nagi.module13.tictactoe.models;

import java.util.List;

import com.nagi.module13.tictactoe.exceptions.InvalidGameConstruction;

public class Game{
    private List<Player> players;
    private Board board;
    private GameStatus gameStatus;
    private int currentPlayer;
    private List<Move> moves;

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

    static class GameBuilder{
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
            this.setBoard(new Board(this.players.size() + 1));
            return new Game(this);
        }




    }
}