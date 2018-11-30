package Gamelogic;

public class Ownership extends GameTurn {

    public void hasOwner() {
        System.out.println("Owner array length " + ownershipArray.length);

        if (ownershipArray[playerPositionArray[playerCount]].equals("Unowned")) { // Checks if the field the player landed on is unowned
            ownershipArray[playerPositionArray[playerCount]] = playerList[playerCount].getName(); // Sets name to new owner
            // buy property
        } else if (ownershipArray[playerPositionArray[playerCount]] != "" || ownershipArray[playerPositionArray[playerCount]] != "Unowned") {
            // Checks if the field the player landed on is already owned by someone.
            for(int i=0;i<playerList.length;i++){
            if(ownershipArray[playerPositionArray[playerCount]]==playerList[i].getName()){
          //  playerList[playerCount].setBalance(rent of field);
          //  playerList[i].setBalance();
                int player1Balance = playerList[playerCount].getBalance();
                int rent = player1Balance-rentArray[playerPositionArray[playerCount]];
                int player2Balance = playerList[i].getBalance();
                int getRent = player2Balance+rentArray[playerPositionArray[i]];
                playerList[i].setBalance(getRent);
        }
        }
    }
    }
}
