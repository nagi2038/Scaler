package com.nagi.module13.tictactoe.controller;
import com.nagi.module13.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.List;

import com.nagi.module13.tictactoe.exceptions.InvalidGameConstruction;
import com.nagi.module13.tictactoe.models.Game;
import com.nagi.module13.tictactoe.models.GameStatus;

public class GameController {
    private Game game;

    public Game createGame(List<Player> players) throws InvalidGameConstruction{
        game =  Game.getBuilder()
        .setPlayers(players)
        .setGameStatus(GameStatus.IN_PROGRESS)
        .setMoves(new ArrayList<>())
        .setCurrentPlayer(0)
        .build();
        return game;
    }

    public GameStatus makeMove(){
        return game.makeMove();

    }

    public void rewatch(){
        game.rewatch();
    }

    public GameStatus getGameStatus(){
        return game.getGameStatus();
    }


    public void displayBoard(){

        game.getBoard().displayBoard();
    }

    public Player getCurrentPlayer(){
       return  game.getCurrentPlayer();
    }
}
