public class ArraysExempel {
    public static void main(String [] args) {
        int nummer = 10;

        String[] namn = new String[3];
        namn[0] = "Josef";
        namn[1] = "Ehab";
        namn[2] = "Linda";

        int[] nummerArray = {100,2002,2333,111,222,400,300,800};

        for(int i = 0;i < namn.length;i++){
            System.out.println(namn[i]);
        }

    }
}
