package Boundry;
import gui_codebehind.GUI_BoardController;
import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;
import Boundry.GUI_FieldFactory;
public class  MonopolyGUI{


    GUI gui = new GUI();

    public void test(){
        // Tester ved at sætte dice til 3,4
        gui.setDice(3,4);
        fieldCreation();
    }

    public void fieldCreation(){
       // GUI_FieldFactory ini = new GUI_FieldFactory();
        // ini.CreateFields();

        GUI_Field[] fields = GUI_FieldFactory.CreateFields();
        GUI_Field[] fields2 = new GUI_Field[24];

        for(int i = 0; i < fields2.length; ++i) {
            fields2[i] = fields[i];
        }

        GUI gui = new GUI(fields2);
        System.out.println(gui.getUserButtonPressed("test\ntest", new String[]{"test1", "test2"}));
        gui.getUserString("test\ntest");
        gui.showMessage("test\ntest");
        GUI_Player gui_Player = new GUI_Player("Brian123456789012345667");
        gui.addPlayer(gui_Player);
        gui.addPlayer(new GUI_Player("Brian123123213213213213"));
        gui.addPlayer(new GUI_Player("Brian2"));
        gui.addPlayer(new GUI_Player("Brian3"));
        fields[23].setSubText("No Luck");
        fields[0].setCar(gui_Player, true);
        fields[0].setCar(gui_Player, false);
        System.out.println(fields[0].hasCar(gui_Player));
    }
}
