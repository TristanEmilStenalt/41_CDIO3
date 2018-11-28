package Gamelogic;
import Boundry.MonopolyGUI;
import Entites.Dice;
import java.util.*;

public class Game extends MonopolyGUI {
    public int position;
    public int rollDice;
    public int rollDice(){
        Random rand = new Random(); //Make an instance of Random
        rollDice = rand.nextInt(6)+1;
         return rollDice;
    }

    public void playerTurn(){
        System.out.println("dank memes");


        boolean run = true;
        while(run=true){

            for(int i=1;i<=playerList.length;i++){

                position = rollDice();
                String rollTurn = gui.getUserString("Player "+i+" Press ok to roll.");
                System.out.println(rollDice);
                fields[position].setCar(playerList[i-1],true);

                // fields[]
               // playerList[i].getCar().

            }
        }
    }

}
