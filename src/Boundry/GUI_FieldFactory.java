package Boundry;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import gui_fields.GUI_Brewery;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Shipping;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_fields.GUI_Tax;
import java.awt.Color;

public final class GUI_FieldFactory {
    private GUI_FieldFactory() {
    }

    public static GUI_Field[] makeFields() {
        GUI_Field[] fields = new GUI_Field[40];
        int i = 0;
        int var2 = i + 1;
        fields[i] = new GUI_Start("Start", "Modtag: 200", "Modtag kr. 200,-\nnÃ¥r de passerer start", Color.RED, Color.BLACK);
        fields[var2++] = new GUI_Street("RÃ¸dovrevej", "Pris:  60", "RÃ¸dovrevej", "Leje:  20", new Color(75, 155, 225), Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "PrÃ¸v lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++] = new GUI_Street("Hvidovrevej", "Pris:  60", "Hvidovrevej", "Leje:  20", new Color(75, 155, 225), Color.BLACK);
        fields[var2++] = new GUI_Tax("Betal\nindkomst-\nskat", "10% el. 200", "Betal indkomstskat\n10% eller kr. 200,-", Color.GRAY, Color.BLACK);
        fields[var2++] = new GUI_Shipping("default", "Ã˜resund", "Pris:  200", "Ã˜resundsredderiet", "Leje:  75", Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Roskildevej", "Pris:  100", "Roskildevej", "Leje:  40", new Color(255, 135, 120), Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "PrÃ¸v lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++] = new GUI_Street("Valby\nLanggade", "Pris:  100", "Valby Langgade", "Leje:  40", new Color(255, 135, 120), Color.BLACK);
        fields[var2++] = new GUI_Street("AllÃ©gade", "Pris:  120", "AllÃ©gade", "Leje:  45", new Color(255, 135, 120), Color.BLACK);
        fields[var2++] = new GUI_Jail("default", "FÃ¦ngsel", "FÃ¦ngsel", "PÃ¥ besÃ¸g i fÃ¦ngslet", new Color(125, 125, 125), Color.BLACK);
        fields[var2++] = new GUI_Street("Frederiks-\nberg AllÃ©", "Pris:  140", "Frederiksberg AllÃ©", "Leje:  50", new Color(102, 204, 0), Color.BLACK);
        fields[var2++] = new GUI_Brewery("default", "Tuborg", "Pris:  150", "Tuborg bryggeri", "10 x [Terningslag]", Color.BLACK, Color.WHITE);
        fields[var2++] = new GUI_Street("BÃ¼lowsvej", "Pris:  140", "BÃ¼lowsvej", "Leje:  50", new Color(102, 204, 0), Color.BLACK);
        fields[var2++] = new GUI_Street("Gammel Kongevej", "Pris:  140", "Gammel Kongevej", "Leje:  50", new Color(102, 204, 0), Color.BLACK);
        fields[var2++] = new GUI_Shipping("default", "D.F.D.S.", "Pris:  200", "D.F.D.S.", "Leje:  75", Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Bernstorffsvej", "Pris:  180", "Bernstorffsvej", "Leje:  60", new Color(153, 153, 153), Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "PrÃ¸v lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++] = new GUI_Street("Hellerupvej", "Pris:  180", "Hellerupvej", "Leje:  60", new Color(153, 153, 153), Color.BLACK);
        fields[var2++] = new GUI_Street("Strandvejen", "Pris:  180", "Strandvejen", "Leje:  60", new Color(153, 153, 153), Color.BLACK);
        fields[var2++] = new GUI_Refuge("default", "Helle", "Helle", "Ta' en pause", Color.WHITE, Color.BLACK);
        fields[var2++] = new GUI_Street("Trianglen", "Pris:  220", "Trianglen", "Leje:  70", Color.RED, Color.BLACK);
        fields[var2++] = new GUI_Chance("?", "PrÃ¸v lykken", "Ta' et chancekort.", new Color(204, 204, 204), Color.BLACK);
        fields[var2++] = new GUI_Street("Ã˜sterbro-\ngade", "Pris:  220", "Ã˜sterbrogade", "Leje:  70", Color.RED, Color.BLACK);
        return fields;
    }
}
