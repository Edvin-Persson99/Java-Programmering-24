public class E2 {

    public static void main(String[] args) {
   
     
        int result = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0)
                continue;
            result = result + i;
            System.out.println(result);
            //result = 0, 2, 6, 12, 20, 30

            
        
        }
            
         
        

    }

}
