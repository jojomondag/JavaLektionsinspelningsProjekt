import java.util.Random;

public class RandomSlumpExempel {
    public static void main(String [] args) {
        Random rng = new Random();

        int nummer = rng.nextInt(100);

        System.out.println(nummer);

        if (nummer > 90){
            System.out.println("Oj det var ett stort nummer");
        }
    }
}