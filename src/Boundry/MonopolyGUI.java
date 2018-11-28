package Boundry;

import Entites.Player;
import Entites.PlayerList;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;


public class  MonopolyGUI{
    public GUI_Player[] playerList;
    public GUI_Field[] fields;
    public GUI gui;

    public void boardSetup() //forsøg på at bruge GUI. opsætning af bræt.
    {
        GUI_Field[] fields = GUI_FieldFactory.createFields();

        GUI gui = new GUI(fields, Color.WHITE);
        int numberOfPlayers = gui.getUserInteger("How many players are you? ");

        if (numberOfPlayers >= 2 && numberOfPlayers<=4){
        GUI_Player[] playerList = PlayerList.createPlayerList(numberOfPlayers);
        for (int i = 1; i <= numberOfPlayers; i++) {
            gui.addPlayer(playerList[i - 1]);
            String name = gui.getUserString("Name of Player" + i + ": ");
            playerList[i - 1].setName(name);
            fields[0].setCar(playerList[i-1],true);
            if(numberOfPlayers==2){
                playerList[i-1].setBalance(20);
            }
            else if(numberOfPlayers==3){
                playerList[i-1].setBalance(18);
            }
            else if(numberOfPlayers==4){
                playerList[i-1].setBalance(16);
            }
        }

        return; // Returns back to Main, and starts the game
    }
    else{
        String restart = gui.getUserString("Please choose between 2 and 4 players...Restart by pressing OK");
        boardSetup();
    }
    }
}
