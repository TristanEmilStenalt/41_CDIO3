package Entites;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Test
    public void roll() {
        Dice testDie = new Dice(6);

        for (int i = 0; i < 1000; i++) {
            int x = testDie.roll();
            boolean y = false;
            if (x <= 6 && x >= 1) {
                y = true;
            } else {
                y = false;
            }
            assertTrue(y);
        }
    }

    @org.junit.Test
    public void rollMultipleTimes() {
        Dice testDie2 = new Dice(6);

        int a = 0;        int b = 0;
        int c = 0;        int d = 0;
        int e = 0;        int f = 0;

        //a - f are counters for each side of our dice. ++counter when dice lands on that side.
        //roll dice 10000 times.

        for(int i=1; i <= 10000; i++){
            switch(testDie2.roll()){
                case 1: a++; break; case 2: b++; break;
                case 3: c++; break; case 4: d++; break;
                case 5: e++; break; case 6: f++; break;
            }
        }

        //check with a delta of 250 that all sidevalues rolled 1670 times.
        assertEquals(1670, a, 250);
        assertEquals(1670, b, 250);
        assertEquals(1670, c, 250);
        assertEquals(1670, d, 250);
        assertEquals(1670, e, 250);
        assertEquals(1670, f, 250);
    }
}


