package com.nagi.module13.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nagi.module13.tictactoe.controller.GameController;
import com.nagi.module13.tictactoe.models.Bot;
import com.nagi.module13.tictactoe.models.BotLevel;
import com.nagi.module13.tictactoe.models.GameStatus;
import com.nagi.module13.tictactoe.models.Player;

public class TicTacToe { // mimicks our frontend

    private static GameController gameController = new GameController();
    public static void main(String[] args)  {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many human players are going to play ? ");
        int numHumanPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0 ; i<numHumanPlayers; i++){
            // TODO edge case is user can give same symbol.
            System.out.println("Give Player"+(i+1)+" Name : ");
            String name = scanner.next();
            System.out.println("Enter Player Symbol ");
            char symbol = scanner.next().charAt(0);
            players.add(new Player(name,symbol));
            System.out.printf("Player Name %s symbol  %c \n" , name , symbol);
        }

        System.out.println("Do you want bot to play ? (y/n)");
        char botReply = scanner.next().toLowerCase().charAt(0);
        if (botReply == 'y'){
            System.out.println("Enter Bot level h/m/l !");
            // TODO take level as input and create obj of bot
            players.add(new Bot("BOT-1", 'B', BotLevel.LOW));
        }

        try {
             gameController.createGame(players);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        while(gameController.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            gameController.displayBoard();
            Player player = gameController.getCurrentPlayer();
            System.out.println(player.getName() + "'s trun, give row and col");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            GameStatus gameStatus = gameController.makeMove(player , row, col);
            if (gameStatus == GameStatus.ENDED){
                System.out.printf("\n\n******** Hurray %s has won the game **********\n\n\n", player.getName());
                gameController.displayBoard();
                System.out.println("\n\n**************** Happy Gaming ***************\n\n");
            }

            if (gameStatus == GameStatus.DRAW){
                System.out.printf("\n\n******** Game Draw **********\n\n\n", player.getName());
                gameController.displayBoard();
                System.out.println("\n\n**************** Happy Gaming ***************\n\n");
            }


        }
    }
    
}
