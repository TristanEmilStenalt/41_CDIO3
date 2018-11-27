package Boundry;

import Entites.Player;
import Entites.PlayerList;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;


public class  MonopolyGUI{

    public void fieldCreation() //forsøg på at bruge GUI. opsætning af bræt.
    {
        GUI_Field[] fields = GUI_FieldFactory.createFields();

        GUI gui = new GUI(fields, Color.WHITE);
        int numberOfPlayers = gui.getUserInteger("How many players are you? ");
        GUI_Player[] playerList = PlayerList.createPlayerList(numberOfPlayers);

        for(int i=1;i<=numberOfPlayers;i++) {
            gui.addPlayer(playerList[i-1]);
            String name = gui.getUserString("Name of Player"+i+": ");
            playerList[i-1].setName(name);
        }
    }



}
