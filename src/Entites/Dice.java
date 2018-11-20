package Entites;
import java.util.Random;

public class Dice{

    //Constructor of player-object
    private int Sides;
    /**
     * Dice is initiated with a Sides Attribute
     *
     * @see Sides                   Sides of the dice, "how many different values can it show"
     *
     * @param Sides                 Sides of the dice, "how many different values can it show"
     *
     * @return void
     * @author Hans P Byager , Tristan
     * @date   08.11.2018
     */
    public Dice(int Sides){
        this.Sides = this.Sides;
    }

    /**
     * Dice needs to recieve an Integer Array after being initiated, such that it knows what values are on what sides of the dice object
     *
     * @see SidesNum                  different values on different sides of the dice
     *
     * @param SidesNum                different values on different sides of the dice
     *
     * @return void
     * @author Hans P Byager , Tristan
     * @date   08.11.2018
     */
    private int[] SidesNum = new int[Sides];
    public void DiceSidesNumDecider(int[] SidesNum){
        this.SidesNum = SidesNum;
    }

    /**
     * A roll funktion that rolls the dice, using a random funktion, to decide what side it lands on, and then reads that sides value to
     * return the value of the rolled side.
     *
     * @return int
     * @author Hans P Byager , Tristan
     * @date   08.11.2018
     */
    public int roll(){
        Random rand = new Random(); //Make an instance of Random
        int roll = rand.nextInt(6)+1; //Random int between [0;max[ +1 ... therefore [1;max]

        //int equalDiceValue = SidesNum[roll-1];
        return roll;
    }

    //get & set Sides
    /**
     * GetSides returns an Integer of the number of Sides on the Dice
     *
     * @return int
     * @author Tristan
     * @date   08.11.2018
     */
    public int getSides()
    {
        return Sides;
    }
    /**
     * setSides gives the Dice a new Sides Value
     *
     * @param Sides         an integer that indicates the number of sides on the dice.
     * @return Void
     * @author Tristan
     * @date   08.11.2018
     */
    public void setSides(int Sides)
    {
        this.Sides = Sides;
    }

    //get & set SidesNum
    /**
     * GetSidesNum returns an Integer Array of the different Values on the Different Dice Sides
     *
     * @return int[]
     * @author Hans P Byager, Tristan
     * @date   08.11.2018
     */
    public int[] getSidesNum()
    {
        return SidesNum;
    }
    /**
     * Gives the Dice new Values on the different sides of the dice.
     *
     * @param SidesNum      an Integer Array that has the size of (Sides) and has the Values of the dice's Sides.
     *
     * @return Void
     * @author Hans P Byager, Tristan
     * @date   08.11.2018
     */
    public void setSidesNum(int[] SidesNum)
    {
        this.SidesNum = SidesNum;
    }

}
