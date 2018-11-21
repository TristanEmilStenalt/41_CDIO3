package Entites;

public class PlayerList {

    Player player1 = new Player("playerOne", 0,0);
    Player player2 = new Player("playerTwo", 0,0);
    Player player3 = new Player("playerThree", 0,0);
    Player player4 = new Player("playerFour", 0,0);
    Player[] thePlayers = new Player[4];


    public Player[] createPlayerList() {
        return thePlayers;
    }
}
