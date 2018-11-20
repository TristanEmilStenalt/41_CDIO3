package Entites;

import java.io.BufferedReader;
import java.io.FileReader;

public class CardList {

    private String CardFile;
    private int NumCards;
    private char regSepSymb = '=';
    private int ReservedLinesForGameMessages = 20;
    private int LineBuffer = 1;
    private int LinesPrCard = 3;

    // Constructor
    /**
     * The builders.FieldBuilder Creates fields and GameTexts from a Txt file ( specified in the input ). how it reads the text is specified in its inputs.
     *@see fieldFile                        the Syntax for reading settings.txt this will look for the '=' symbol to see the Value of each line after that symbol
     *@see NumFields                        the Number of fields that Fieldbuilder needs to create in the fields array, also the size of the array
     *@see ReservedLinesForGameMessages     the lines that are reserved for messages in the txt files, or the lines that it looks for messages in, and the lines it skippes when making fields
     *@see LineBuffer                       this is the whitespace between Fields,
     *@see LinesPrField                     linesPrField is, how many lines does fieldBuilder exspect to be a single field.
     *
     *@param fieldFile                        the Syntax for reading settings.txt this will look for the '=' symbol to see the Value of each line after that symbol
     *@param NumFields                        the Number of fields that Fieldbuilder needs to create in the fields array, also the size of the array
     *@param ReservedLinesForGameMessages     the lines that are reserved for messages in the txt files, or the lines that it looks for messages in, and the lines it skippes when making fields
     *@param LineBuffer                       this is the whitespace between Fields,
     *@param LinesPrField                     linesPrField is, how many lines does fieldBuilder exspect to be a single field.
     *
     *@return builders.FieldBuilder
     *@author Hans P Byager
     *@date   07.11.2018
     */
    public CardList(String CardFile, int NumCards)throws Exception{
        //String fieldFile , int NumFields , int ReservedLinesForGameMessages, int LineBuffer, int LinesPrField
        this.CardFile = CardFile;
        this.NumCards = NumCards;
        //this.ReservedLinesForGameMessages = ReservedLinesForGameMessages;
        //this.LineBuffer = LineBuffer;
        //this.LinesPrField = LinesPrField;
    }
    private String[] GameMessages = new String[ReservedLinesForGameMessages]; // denne laves Efter builders.FieldBuilder initieres med ReservedLines
    // Reading the Reserved lines


    /**
     * BuildGameMessages looks through the ReservedLinesForGameMessages, and stuffs them into a messages array, and returns it. it needs no parameters because it uses the variables initiatet at the contructor.
     *
     * @return String Array
     * @author Hans P Byager
     * @date   07.11.2018
     */
    public String[] BuildGameMessages() throws Exception{
        BufferedReader reader = new BufferedReader (new FileReader(CardFile));
        String Currentline;
        Currentline = reader.readLine();

        for(int i = 0; i < (ReservedLinesForGameMessages); i++){
            String Value = Currentline;
            GameMessages[i] = Value;
            //System.out.println(Value);
            Currentline = reader.readLine();
        }

        reader.close();
        return GameMessages;
    }

    /**
     * BuildFields skips the ReservedLinesForGameMessages, then buffers one line of text, and then it goes through each
     * NumFields ammount of lines, and puts them into a Field, all the while converting to the right type of input
     * and stuffing those Field's into a Fields array and returning it.
     *
     *@return Field Array
     *@author Hans P Byager
     *@date   07.11.2018
     */
    public Cards[] BuildCards() throws Exception{
        BufferedReader reader = new BufferedReader (new FileReader(CardFile));
        String Currentline;
        String Value ="Empty";

        // the logic is ,the first line has allready bin loaded, so load the remaining reserved lines - 1 ( -1 becasue the first line of the reserved lines has already bin loaded).
        // read passed the reserved lines.
        for(int q = 0; q <= (ReservedLinesForGameMessages-1); q++)
        {
            Currentline = reader.readLine();
        }


        // then Skips a bufferline
        for(int a = 1; a <= LineBuffer; a++){
            Currentline = reader.readLine();
            //System.out.println("Nyt Felt");
        }

        Cards[] cards = new Cards[NumCards];
        for(int t = 0; t < NumCards; t++ ){
            String Line[] = new String[LinesPrCard];

            // Read LinesPrField amount of lines and put into array
            for(int i = 0 ; i < LinesPrCard; i++ ){
                //If the field doesnt work the variables doesnt equal to null, but 0 instead.
                Currentline = reader.readLine();
                Line[i] = Currentline;
                //System.out.println("line number " + i + " : "+Line[i]);
            }

            int Int1;

            try{
                Int1 = Integer.parseInt(Line[2]);
            }
            catch (NumberFormatException nfe) {
                Int1 = Integer.parseInt(Line[2]);
            }

            cards[t] = new Cards( Line[0] , Line[1] , Int1 );

            //Here it moves a couple lines down if needed.

            for(int a = 1; a <= LineBuffer; a++){
                Currentline = reader.readLine();
                //System.out.println("Nyt Felt");
            }
        }
        reader.close();
        return cards;
    }
}
