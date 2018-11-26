package Entites;

public class PlayerList {

    // Four fixed players in an array
    private Player player1 = new Player("playerOne", 0,0);
    private Player player2 = new Player("playerTwo", 0,0);
    private Player player3 = new Player("playerThree", 0,0);
    private Player player4 = new Player("playerFour", 0,0);
    private Player[] thePlayers = {player1,player2,player3,player4};

    public PlayerList () //Constructor
    {
        this.thePlayers = thePlayers;
    }


//    public Player[] createPlayerList() //createPlayerList method, basically get method.
//    {
//        return thePlayers;
//    }

}
