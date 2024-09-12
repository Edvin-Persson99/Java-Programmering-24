public class E2 {

    public static void main(String[] args) {

        int result = 200;
        for (int i = 10; i >= 5; i--) {
            result = result - i;

            // result = 190, 181, 173, 166, 160, 155 
            // i = 9, 8, 7, 6, 5  
        }

        System.out.println(result);

    }

}
