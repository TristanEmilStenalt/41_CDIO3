package Boundry;

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
        String name1 = gui.getUserString("Name Player1: ");
        GUI_Car car1 = new GUI_Car(Color.RED, Color.RED, GUI_Car.Type.UFO, GUI_Car.Pattern.HORIZONTAL_GRADIANT); //
        GUI_Player gui_Player1 = new GUI_Player("Player 1: "+name1, 1000, car1);
        gui.addPlayer(gui_Player1);
        String name2 = gui.getUserString("Name Player2: ");
        GUI_Car car2 = new GUI_Car(Color.BLUE, Color.BLUE, GUI_Car.Type.RACECAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
        GUI_Player gui_Player2 = new GUI_Player("Player 2: "+name2, 1000, car2);
        gui.addPlayer(gui_Player2);
        String name3 = gui.getUserString("Name Player3: ");
        GUI_Car car3 = new GUI_Car(Color.WHITE, Color.RED, GUI_Car.Type.CAR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
        GUI_Player gui_Player3 = new GUI_Player("Player 3: "+name3,1000, car3);
        gui.addPlayer(gui_Player3);
        String name4 = gui.getUserString("Name Player4: ");
        GUI_Car car4 = new GUI_Car(Color.GRAY, Color.GRAY, GUI_Car.Type.TRACTOR, GUI_Car.Pattern.HORIZONTAL_GRADIANT);
        GUI_Player gui_Player4 = new GUI_Player("Player 4: "+name4,1000, car4);
        gui.addPlayer(gui_Player4);

        fields[0].setCar(gui_Player1, true);
        fields[0].setCar(gui_Player2, true);
        fields[0].setCar(gui_Player3, true);
        fields[0].setCar(gui_Player4, true);


    }



}
