//
//package Gamelogic;
//
//import Entites.Dice;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class Game {
//
//    public static void main(String[] args) throws Exception
//    {
//        Dice dice = new Dice(6);//Make an instance of Dice.
//        Scanner keyboard = new Scanner(System.in); //Make an instance of Scanner.
//
//        String fileName = "./Texts/FieldTexts.txt";
//        BufferedReader reader = new BufferedReader(new FileReader(fileName)); //read from file
//
//
//        String[] fieldTexts = new String[13]; //Declaration of fieldTexts array
//        String lineContents = reader.readLine(); //
//        int iterator = 0;
//        while (lineContents != null) //fill fieldTexts array up with lines from textfile.
//        {
//            fieldTexts[iterator] = lineContents;
//
//            lineContents = reader.readLine();
//            iterator++;
//        }
//
////        for (String fText: fieldTexts)
//>>>>>>> Stashed changes
////        {
////
////            turnCount++;
////            System.out.println("--- Turn " + turnCount + " ---");
////
////            for (Player Player : thePlayers) //roll dice for each player, add to score, print roll and score
////            {
////                //String turnShift = keyboard.nextLine();
////                if (turnShift.equals("Exit"))
////                {
////                    break;
////                }
////                else {
////                    int rollResult;
////                    int preScore;
////                    int postScore;
////                    int fieldEffect;
////                    int playerPos;
////                    int prePos;
////                    //playerplacement=(playerplacement+D1.roll()+D2.roll())%13;
////
////                    do {
////                        prePos = Player.getPosition();
////                        preScore = Player.getScore();
////
////                        rollResult = dice.roll(6) + dice.roll(6);
////
////                        playerPos = (Player.getPosition()+rollResult)%13;
////                        Player.setPosition(playerPos);
////
////                        fieldEffect = board[playerPos].getFieldEffect();
////                        postScore = preScore + fieldEffect;
////                        Player.setScore(postScore);
////
////                        if (Player.getScore() < 0) {
////                            Player.setScore(0);
////                        }
////
////
////                        if (Player.getScore() < winPoints) //to determine if a player has under max amount of points.
////                        {
////                            gameWon = false;
////                            System.out.println(fieldTexts[playerPos]);
////                            System.out.println(Player.getName()+ " Stands on field: "+ prePos + ", rolls: " + rollResult + " and lands on field: "+ playerPos +" and has total score of: " + preScore + " + " + fieldEffect + " = " + Player.getScore()); //usual roll message
////                            //System.out.println(fieldTexts[playerPos]);
////                        } else //player won game, setting gameWon true and breaking out of loop. Therefore remaining players won't get to roll this turn.
////                        {
////                            gameWon = true;
////                            System.out.println(fieldTexts[playerPos]);
////                            System.out.println(Player.getName()+ " Stands on field:" + prePos + ", rolls: " + rollResult + " and wins with score of: " + preScore + " + " + fieldEffect + " = " + Player.getScore()); //if player won message
////                            //System.out.println(fieldTexts[playerPos]);
////                            break;
////                        }
////
////                    } while (board[playerPos].getFieldID() == 10);
////
////                }
////                if (gameWon == true) //player won game, setting gameWon true and breaking out of loop. Therefore remaining players won't get to roll this turn.
////                    break;
////
////
////            }
//////            }
////
////            System.out.println(); //blank line to seperate turns apart
////
////        } while (gameWon == false); //while no one has won.
////
////
////
////        System.out.println();
////        System.out.println("Player won, end of game");
////        keyboard.close();
////    }
////}
