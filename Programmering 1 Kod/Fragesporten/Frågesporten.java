import java.util.Scanner;

public class Frågesporten {
    //TODO Skapa ett spel till användaren som ger användaren olika frågor / mattematiska problem som denna skall försöka klara av
    //TODO Skapa poängsystem som låter användaren sammla poäng och i slutet kan man få se hur mycket man lyckades sammla
    public static void main(String[] args) {
        int poäng = 0;

        System.out.println("Välkommna till frågesporten i detta spel kommer du att få ett antal frågor som du skall svar på");
        System.out.println("Lycka till!");

        Scanner scan = new Scanner(System.in);

        //Fråga 1
        System.out.println("Fråga 1: Vem är den bästa fotbollspelaren 1. Zlatan 2. Messi");
        String svar = scan.nextLine();

        if (svar.equals("Zlatan")){
            System.out.println("rätt");
            poäng += 10;
        }
        else {
            System.out.println("fel");
        }

        //Fråga 2
        System.out.println("Fråga 2: Vad blir 10 + 10");
        svar = scan.nextLine();

        if (svar.equals("20")){
            System.out.println("rätt");
            poäng += 10;
        }
        else{
            System.out.println("fel");
        }

        //Fråga 3
        System.out.println("Fråga 3: är kaffe gott ja/nej");
        svar = scan.nextLine();

        if (svar.equals("ja")){
            System.out.println("rätt");
            poäng += 10;
        }
        else{
            System.out.println("fel");
        }

        System.out.println("Tack för att du testade frågesporten");
        System.out.println("Du lyckades sammla " + poäng + " poäng");
    }
}
