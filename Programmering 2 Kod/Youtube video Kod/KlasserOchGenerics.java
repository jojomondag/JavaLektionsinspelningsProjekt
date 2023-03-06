public class KlasserOchGenerics {
    public static void main(String[] args) {
        Skrivare<Integer> skrivare = new Skrivare<>(200);
        Buss b1 = new Buss("Honda",200,"Grön",false);

        Skrivare<Buss> bussSkrivare = new Skrivare<>(b1);

        skrivare.SkrivUt();
        bussSkrivare.SkrivUt();
    }
}
