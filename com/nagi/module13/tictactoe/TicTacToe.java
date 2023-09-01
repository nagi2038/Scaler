package com.nagi.module13.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nagi.module13.tictactoe.controller.GameController;
import com.nagi.module13.tictactoe.models.Bot;
import com.nagi.module13.tictactoe.models.BotLevel;
import com.nagi.module13.tictactoe.models.Player;

public class TicTacToe { // mimicks our frontend

    private static GameController gameController;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many human players are going to play ? ");
        int numHumanPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<>();
        for (int i = 0 ; i<numHumanPlayers; i++){
            System.out.println("Give Player"+(i+1)+" Name : ");
            String name = scanner.nextLine();
            Character symbol = scanner.nextLine().charAt(0);
            players.add(new Player(name,symbol));
        }

        System.out.println("Do you want bot to play ? (y/n)");
        char botReply = scanner.nextLine().toLowerCase().charAt(0);
        if (botReply == 'y'){
            System.out.println("Enter Bot level h/m/l !");
            players.add(new Bot("BOT-1", 'B', BotLevel.LOW));
        }
        gameController.createGame(players)
    }
    
}
