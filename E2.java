public class E2 {

    public static void main(String[] args) {
   
     
        int result = 100;
        for (int i = 0; i < 100; i++) {
            if (i == 11)
                break;
            result = result - i;
            System.out.println(result);
        }
            
         // Result = 100, 99, 97, 94, 90, 85, 79, 72, 64, 55, 45        
         // i = 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
         //Resultatet blir 45 eftersom även om for loopen går till 99 så avbryts den när i är 11 eftersom det finns ett break statement 
        

    }

}
