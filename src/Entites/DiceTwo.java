package Entites;

import java.util.Random;

public class DiceTwo {

    private int sides;


    public DiceTwo(int sides) //Constructor
    {
        this.sides = sides;
    }


    public int roll() //Roll method
    {
        Random rand = new Random(); //Make an instance of Random
        int roll = rand.nextInt(sides)+1; //Random int between [0;max[ +1 ... therefore [1;max]

        return roll;
    }

}