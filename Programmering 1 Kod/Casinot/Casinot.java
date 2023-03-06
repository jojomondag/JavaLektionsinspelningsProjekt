import java.util.Random;
import java.util.Scanner;

public class Casinot {
    public static void main(String[] args) {
        String[] användare = new String[3];
        användare[0] = "Josef";
        användare[1] = "Ehab";
        användare[2] = "Linda";

        int[] pengar = new int[3];
        pengar[0] = 100;
        pengar[1] = 100;
        pengar[2] = 100;

        System.out.println("Välkommna till Casinot dags att börja betta");

        Scanner scan = new Scanner(System.in);
        boolean PåCasinot = true;
        Random rng = new Random();
        int sannolikhetVinst = 3;

        while (PåCasinot){
            for (int i = 0; i < användare.length; i++) {
                //Betting delen
                System.out.println(användare[i] + " Börjar betta");

                System.out.println("Hur mycket vill du betta");
                int bettAmmount = scan.nextInt();
                System.out.println("Vilket nummer ifrån 1 - 10 gissar du på");
                int nummerGissat = scan.nextInt();

                //Vinn logik
                if (nummerGissat == rng.nextInt(sannolikhetVinst)){
                    System.out.println("Du vann");
                    pengar[i] = pengar[i] + bettAmmount;
                }
                //Förlust logik
                else{
                    System.out.println("Du förlorade");
                    pengar[i] = pengar[i] - bettAmmount;
                }

                //Om någon användare väljer att avsluta så kommer Casinot att avslutas
                System.out.println("Vill du gå hem");
                String Answer = scan.next();

                if (Answer.equals("ja")){
                    PåCasinot = false;
                }

            }
            //Här skall vi se spelarnas resultat.

            for (int i = 0; i < användare.length; i++) {
                System.out.println(användare[i] + " gick hem med " + pengar[i]);
            }

            System.out.println("Då var detta slut tack för att ni spelade");

        }

    }
}
