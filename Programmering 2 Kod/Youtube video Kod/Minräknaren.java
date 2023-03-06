import java.util.Scanner;

public class Minräknaren {
    public static void main(String[] args) {
        System.out.println("Välkommen till miniräknaren vad vill du göra");
        System.out.println("1. Addera");
        System.out.println("2. Subtrahera");
        System.out.println("3. Multiplicera");

        Scanner scan = new Scanner(System.in);
        int svar = scan.nextInt();

        switch(svar) {
            case 1:
                System.out.println("Var god skriv in 2 tal som skall Adderas");
                System.out.println(Addition(scan.nextInt(),scan.nextInt()));
                break;
            case 2:
                // code block
                break;
            case 3:
                System.out.println("Var god skriv in 2 tal som skall Multipliceras");
                System.out.println(Multiplication(scan.nextInt(),scan.nextInt()));
                break;
            default:
                // code block
        }
    }
    public static int Addition(int nummer1, int nummer2)
    {
        return nummer1 + nummer2;
    }
    public static int Multiplication(int nummer1, int nummer2)
    {
        return nummer1 * nummer2;
    }
}
