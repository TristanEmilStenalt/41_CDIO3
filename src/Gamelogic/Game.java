package Gamelogic;
import Boundry.MonopolyGUI;
import Entites.Dice;
import java.util.*;

public class Game extends MonopolyGUI {
    public int position;
    public int roll;
    public String ownershipArray[] = {"", "Unowned", "Unowned", "", "Unowned", "Unowned", "", "Unowned", "Unowned", "", "Unowned", "Unowned", "", "Unowned", "Unowned", "", "Unowned", "Unowned", "", "Unowned", "Unowned", "", "Unowned", "Unowned",};
    public int playerCount; // This number keeps track of who's turn it is, by counting playerList
    public int rentArray[] = {-2,1,1,0,1,1,0,2,2,0,2,2,0,3,3,0,3,3,0,4,4,0,4,4};

    public int playerPositionArray[]={0,0,0,0};

    public void playerTurn() {
        GameTurn takeTurn = new GameTurn();
        System.out.println("Number of players: " + playerList.length);
        // This while loop is currently set to run indefinitely so we can keep testing the diceRoll
        while (playerList[0].getBalance()>0&&playerList[1].getBalance()>0&&playerList[2].getBalance()>0&&playerList[3].getBalance()>0) {
            takeTurn.turn();
        }
    }

    public int rollDice(){
        Random rand = new Random(); //Make an instance of Random
        roll = rand.nextInt(6)+1;
        return roll;
    }
    public void buyProperty(){
      //  isOwner();
        int playerBalance = playerList[playerCount].getBalance();
        int newBalance = playerBalance-rentArray[playerPositionArray[playerCount]];
        playerList[playerCount].setBalance(newBalance);
        return;
    }
    public void hasOwner() {
        System.out.println("Owner array length " + ownershipArray.length);

        if (ownershipArray[playerPositionArray[playerCount]].equals("Unowned")) { // Checks if the field the player landed on is unowned
            ownershipArray[playerPositionArray[playerCount]] = playerList[playerCount].getName(); // Sets name to new owner
            buyProperty();
            return;
        } else if (ownershipArray[playerPositionArray[playerCount]] != "" && ownershipArray[playerPositionArray[playerCount]] != "Unowned") {
            // Checks if the field the player landed on is already owned by someone.
            int count=0;
            for(int i=0;i<playerList.length;i++){
                if(ownershipArray[playerPositionArray[playerCount]]==playerList[i].getName()) {
                    //  playerList[playerCount].setBalance(rent of field);
                    //  playerList[i].setBalance();
                    int player1Balance = playerList[playerCount].getBalance();
                    int rent = player1Balance-rentArray[playerPositionArray[playerCount]];
                    playerList[playerCount].setBalance(rent);
                    int player2Balance = playerList[i].getBalance();
                    int getPaid = player2Balance+rentArray[playerPositionArray[playerCount]];
                    playerList[i].setBalance(getPaid);
                }
            }
            return;
        }
    }

}



