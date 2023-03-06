public class Skrivare<T> {
    private T skrivUtDetta;

    public Skrivare(T skrivUtDetta){
        this.skrivUtDetta = skrivUtDetta;
    }
    public void SkrivUt(){
        System.out.println(skrivUtDetta);
    }
}
