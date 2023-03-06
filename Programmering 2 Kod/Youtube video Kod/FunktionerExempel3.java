public class FunktionerExempel3{
    public static void main(String[] args) {
        HittaStörstaNumret(555,790);
    }
    public static void HittaStörstaNumret(int nummer1, int nummer2)
    {
        if (nummer1 > nummer2){
            System.out.println(nummer1 + " är störst");
        }
        else{
            System.out.println(nummer2 + " är störst");
        }
    }
}
