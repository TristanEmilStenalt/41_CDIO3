package Entites;

public class Player
{
    private String name;
    private int Points;
    private int Position;

    /**
     * PlayerObject, is a infomation holder of the players data. name, points, and positon.
     *
     * @see name                    Particularname of this player
     * @see Points                  Points of this particular player
     * @see Position                position of this particular player
     *
     * @param name                  the name that the player is instanciated with
     * @param PlayerStartPosition   where does a player start on the board
     * @param Points                what is the starting value of points
     *
     *@return This class will initiate the Dice and the Players with Specified Settings from the Settings.txt.
     *@author Hans P Byager , Tristan
     *@date   07.11.2018
     */
    public Player(String name, int PlayerStartPosition, int Points) //Constructor of player-object
    {
        this.name = name;
        this.Points = Points;
        this.Position = PlayerStartPosition;
    }


//get & set methods
    //get & set name
    /**
     * getName returns the name Attribute of the particular Player object
     *
     *@return name String
     *@author Hans P Byager , Tristan
     *@date   07.11.2018
     */
    public String getName()
    {
        return name;
    }

    /**
     * setName gives the player a new value in its name Attribute
     * @param name     the new points that the player needs to contain.
     *
     * @return void
     * @author Hans P Byager , Tristan
     * @date   07.11.2018
     */
    public void setName(String name)
    {
        this.name = name;
    }

    //get & set Position
    /**
     * getPosition returns the Position Attribute of the particular Player object
     *
     *@return Position int
     *@author Hans P Byager , Tristan
     *@date   07.11.2018
     */
    public int getPosition()
    {
        return Position;
    }
    /**
     * setPosition gives the player a new value in its Position Attribute
     * @param Position     the new points that the player needs to contain.
     *
     * @return void
     * @author Hans P Byager , Tristan
     * @date   07.11.2018
     */
    public void setPosition(int Position)
    {
        this.Position = Position;
    }

    //get & set score
    /**
     * getPoints returns the Points Attribute of the particular Player object
     *
     * @return Points Attribute
     * @author Hans P Byager , Tristan
     * @date   07.11.2018
     */
    public int getPoints()
    {
        return Points;
    }
    /**
     * setPoints Sets a new Value in its Point Attribute
     * @param Points     the new points that the player needs to contain.
     *
     * @return void
     * @author Hans P Byager , Tristan
     * @date   07.11.2018
     */
    public void setPoints(int Points)
    {
        this.Points = Points;
    }


}
