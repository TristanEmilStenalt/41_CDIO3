package Gamelogic;

import Boundry.MonopolyGUI;
import Entites.Dice;

import java.security.acl.Owner;

public class GameTurn extends Game {
    Dice Die = new Dice(6);

    public void turn() {
        playerCount = 0; // Starts at player 1, which has index=0
        Rent pay = new Rent();
        for (int i = 0; i < playerList.length; i++) {
            // Prompts in the UI for the player to roll the dice.
            MonopolyGUI rollText = new MonopolyGUI();
            String rollTurn = gui.getUserString("Press ok to roll.");
            int roll = Die.roll();

            // Now the player has rolled. Before he puts the car on the new field, the car is removed from the previous
            fields[playerPositionArray[playerCount]].removeAllCars();
            playerPositionArray[playerCount] += roll;
            if(playerPositionArray[playerCount]>=24) {
                playerPositionArray[playerCount] = playerPositionArray[playerCount] % fields.length;
                playerList[playerCount].setBalance(playerList[playerCount].getBalance()+2);
            }                                                                                           // Makes sure that the player will move over the starting field properly
          //  payRent();// Now we know where the player is on the board. Time to pay rent!
            hasOwner();
            gui.setDie(roll);
            fields[playerPositionArray[playerCount]].setCar(playerList[playerCount], true); // This sets the new position of the car.
            gui.showMessage("You rolled " + roll + " and landed on " + playerPositionArray[i]);
            playerCount++;
        }
        return;
    }
}
