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
        // This while loop is currently set to run indefinitely so we can keep testing the diceRoll
        while (run = true) {
            for (int i = 1; i <= playerList.length; i++) {
                // Prompts in the UI for the player to roll the dice.
                MonopolyGUI rollText = new MonopolyGUI();
                String rollTurn = gui.getUserString("Press ok to roll.");

                playerPositionArray[i-1]=+rollDice();
                //Now the player has rolled. Before he puts the car on the new field, the car is removed from the previous
                fields[playerPositionArray[i-1]].removeAllCars();
                System.out.println("Player " + i + " rolled: " + playerPositionArray[i-1]); // used for debugging in console
                System.out.println(rollDice);
                fields[playerPositionArray[i-1]].setCar(playerList[i - 1], true); // This sets the new position of the car.
                // fields[]
            }
        }
    }
}
