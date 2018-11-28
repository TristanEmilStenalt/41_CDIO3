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
    public int playerPositionArray[]={0,0,0,0};
    public void playerTurn() {
        boolean run = true;
        System.out.println("Number of players: " + playerList.length);
        while (run = true) {
            for (int i = 1; i <= playerList.length; i++) {
                MonopolyGUI rollText = new MonopolyGUI();
                rollText.guiGameText();

                fields[playerPositionArray[i-1]].removeAllCars();
                playerPositionArray[i-1]=+rollDice();
                System.out.println("Player " + i + " rolled: " + playerPositionArray[i-1]); // used for debugging in console
                System.out.println(rollDice);
                fields[playerPositionArray[i-1]].setCar(playerList[i - 1], true);
                // fields[]
            }
        }
    }
}
