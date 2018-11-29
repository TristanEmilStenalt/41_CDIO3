package Gamelogic;
import Boundry.MonopolyGUI;
import Entites.Dice;
import java.util.*;

public class Game extends MonopolyGUI {
    public int position;
    public int roll;
    public int rollDice(){
        Random rand = new Random(); //Make an instance of Random
        roll = rand.nextInt(6)+1;
         return roll;
    }
    public int playerCount; // This number keeps track of who's turn it is, by counting playerList

    public int rentArray[] = {-2,1,1,0,1,1,0,2,2,0,2,2,0,3,3,0,3,3,0,4,4,0,4,4};
    public String isOwner[] ={"","Unowned","Unowned","","Unowned","Unowned","","Unowned","Unowned","","Unowned","Unowned","","Unowned","Unowned","","Unowned","Unowned","","Unowned","Unowned","","Unowned","Unowned",};
    public int playerPositionArray[]={0,0,0,0};
    public void playerTurn() {
        boolean run = true;
        System.out.println("Number of players: " + playerList.length);
                                                                                                     // This while loop is currently set to run indefinitely so we can keep testing the diceRoll
        while (playerList[0].getBalance()>0||playerList[1].getBalance()>0||playerList[2].getBalance()>0 ||playerList[3].getBalance()>0) {
            playerCount=0; // Starts at player 1, which has index=0
            for (int i = 1; i <= playerList.length; i++) {

                // Prompts in the UI for the player to roll the dice.
                MonopolyGUI rollText = new MonopolyGUI();
                String rollTurn = gui.getUserString("Press ok to roll.");
                rollDice();
                                                                                                      // Now the player has rolled. Before he puts the car on the new field, the car is removed from the previous
                fields[playerPositionArray[playerCount]].removeAllCars();
                playerPositionArray[playerCount]+=roll;
                playerPositionArray[playerCount]=playerPositionArray[playerCount]%fields.length;      // Makes sure that the player will move over the starting field properly
                payRent();                                                                            // Now we know where the player is on the board. Time to pay rent!
                System.out.println("Player " + i + " rolled: " + roll);                               // Used for debugging in console
                System.out.println(roll);
                gui.setDie(roll);
                fields[playerPositionArray[playerCount]].setCar(playerList[playerCount],true); // This sets the new position of the car.
                gui.showMessage("You rolled "+roll+" and landed on "+playerPositionArray[i-1]);
                // fields[]
                playerCount++;
            }
        }
        gui.showMessage("Somebody lost! The game has ended!");
    }
    public void payRent(){
      //  isOwner();
        int playerBalance = playerList[playerCount].getBalance();
        int rent = playerBalance-rentArray[playerPositionArray[playerCount]];
        playerList[playerCount].setBalance(rent);
        return;
    }
    public void isOwner(){
        System.out.println("Owner array length "+isOwner.length);

        if(isOwner[playerPositionArray[playerCount]].equals("Unowned")){ // Checks if the field the player landed on is unowned
            isOwner[playerPositionArray[playerCount]] = playerList[playerCount].getName();
        }
        else if(isOwner[playerPositionArray[playerCount]]!="" || isOwner[playerPositionArray[playerCount]]!="Unowned") {
            // Checks if the field the player landed on is already owned by someone.
        String payOwner = isOwner[playerPositionArray[playerCount]];

        }
    }
}



