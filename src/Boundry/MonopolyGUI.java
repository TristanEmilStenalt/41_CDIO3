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

        GUI_Player[] playerList = PlayerList.createPlayerList(3);


        GUI gui = new GUI(fields, Color.WHITE);

        gui.addPlayer(playerList[0]);
        gui.addPlayer(playerList[1]);
        gui.addPlayer(playerList[2]);


    }



}
