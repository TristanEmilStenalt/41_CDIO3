package Boundry;
import gui_codebehind.GUI_BoardController;
import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

public class  MonopolyGUI{


    GUI gui = new GUI();

    public void test(){
        // Tester ved at sætte dice til 3,4
        gui.setDice(3,4);
        fieldCreation();
    }

    public void fieldCreation(){
        GUI_Field[] makeFields();
    }
}
