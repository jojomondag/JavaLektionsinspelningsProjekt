import java.util.HashSet;
import java.util.Iterator;

public class Yatzy_2_par {
    public static void main(String[] args) {
        int[] minaNummer = new int[5];

        int lookForNumber = 4;

        minaNummer[0] = 4;
        minaNummer[1] = 2;
        minaNummer[2] = 3;
        minaNummer[3] = 4;
        minaNummer[4] = 4;

        int counter = 0;

        //Skapa en tempvariabel.

        for (int i = 0; i < minaNummer.length; i++) {
            if(minaNummer[i] == lookForNumber)
            {
                counter++;
            }
        }

        System.out.println("You found " + lookForNumber + " " + counter + " Times ");

    }
}
