public class FunktionerExempelMethodOverloading {
    public static void main(String[] args) {
        System.out.println(Addition(20,80));
        System.out.println(Addition(50,50,100));
    }
    public static int Addition(int nummer1,int nummer2){
        return nummer1 + nummer2;
    }
    public static int Addition(int nummer1,int nummer2, int nummer3){
        return nummer1 + nummer2 + nummer3;
    }
}
