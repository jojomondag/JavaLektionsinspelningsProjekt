public class NestedIfStataementAndLoops {
    public static void main(String [] args) {

        int nummer = 0;

        for(int i = 0;i < 10;i++) {
            for(int x = 0;x < 10;x++){
                nummer++;
                System.out.println("Hej på dig" + nummer);
                while(true)
                {
                    //Varning oändlig loop!!!
                }
            }
        }
    }
}
