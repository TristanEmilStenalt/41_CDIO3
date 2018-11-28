import Boundry.MonopolyGUI;
import Gamelogic.Game;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MonopolyGUI guiTest = new MonopolyGUI();
        guiTest.boardSetup();
        //gui.boardSetup is returned after setting up board and players.
        //Now we start the game.
        Game startGame = new Game();
        startGame.playerTurn();
    }

}
