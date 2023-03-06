import com.sun.tools.javac.Main;
import java.util.ArrayList;

public class KlasserObjektExempel {
    public static void main(String[] args) {
        //Här skapar vi våra 3 bilar
        Bil bil1 = new Bil("BMW",120,"Röd", false);
        Bil bil2 = new Bil("Volvo",90,"Blå", true);
        Bil bil3 = new Bil("Ferrari",232,"Grön", false);

        //Här skapar vi motorcyklar
        Motorcykel m1 = new Motorcykel("Harley Davidsson",140,"Röd",false);

        //Här skapar vi en Buss
        Buss b1 = new Buss("Volvo",80,"Blåa",false);

        //Här skapar jag en lista som kan hålla Fordon
        ArrayList<Fordon> allaFordon = new ArrayList<Fordon>();
        allaFordon.add(m1);
        allaFordon.add(b1);

        //Skapande av Arraylist
        ArrayList<Bil> allaBilar = new ArrayList<Bil>();

        //Lägga till items till Arraylisten
        allaBilar.add(bil1);
        allaBilar.add(bil2);
        allaBilar.add(bil3);

        //Kommer åt items och använder sig av dem
        //Här när vi kommer åt objekten vill vi använda oss av en loop
        for (Bil bilen : allaBilar){
            bilen.SkrivaUtAllaVärden();
        }
    }
}

