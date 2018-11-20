package Entites;

public class Cards {

    private String CardName;
    private String CardMessage;
    private int numcards = 20;
    private int Cardeffect;

public Cards ( String CardName , String CardMessage , int CardEffect){
    this.CardName = CardName;
    this.CardMessage = CardMessage;
    this.Cardeffect = CardEffect;
}

    public String getCardName() {
        return CardName;
    }


}

