package Gamelogic;

public class Rent extends GameTurn {
    public void payRent(){
        //  isOwner();
        int playerBalance = playerList[playerCount].getBalance();
        int rent = playerBalance+rentArray[playerPositionArray[playerCount]];
        playerList[playerCount].setBalance(rent);
        return;
    }
}
