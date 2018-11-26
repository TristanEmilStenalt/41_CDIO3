package Boundry;

import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;


public class  MonopolyGUI{

    GUI gui = new GUI();



    public void test(){
        // Tester ved at sætte dice til 3,4
        gui.setDice(3,4);
        fieldCreation();
    }



    public void fieldCreation() //forsøg på at bruge GUI. opsætning af bræt.
    {
        GUI_Field[] fields = GUI_FieldFactory.createFields();
        GUI_Field[] fields2 = new GUI_Field[24];

        for(int i = 0; i < fields2.length; ++i) {
            fields2[i] = fields[i];
        }

        GUI gui = new GUI(fields2);

        GUI_Player gui_Player1 = new GUI_Player("player 1: Navn");
        gui.addPlayer(gui_Player1);
        GUI_Player gui_Player2 = new GUI_Player("player 2: Navn");
        gui.addPlayer(gui_Player2);
        GUI_Player gui_Player3 = new GUI_Player("player 3: Navn");
        gui.addPlayer(gui_Player3);
        GUI_Player gui_Player4 = new GUI_Player("player 4: Navn");
        gui.addPlayer(gui_Player4);

        fields[0].setCar(gui_Player1, true);
        fields[6].setCar(gui_Player2, true);
        fields[9].setCar(gui_Player3, true);
        fields[17].setCar(gui_Player4, true);
    }



}
