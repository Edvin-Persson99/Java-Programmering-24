public class E2 {

    public static void main(String[] args) {

      

        
   
     for(int i = 1,counter = 0, sum = 0; i < 100; i++){


        if (counter == 10) {
            System.out.println(sum);
            break;
            
        }

        if (i % 2 != 0) {
            sum+=i;
            counter++;
            System.out.println(sum);
        }

     }



    }

}
