public class E1 {

    public static void main(String[] args) {
        
      int number = 9;

      if (number % 2 == 0 && number > 10) {
        
        System.out.println("The number is even and greater than 10");
      }else if (!(number % 2 == 0) && number > 10) {
        System.out.println("The number is odd and greater than 10");
      }else if (!(number % 2 == 0) && number < 10){
        System.out.println("The number is odd and less than 10");
      } else if ((number % 2 == 0) && number < 10) {
        System.out.println("The number is even and less than 10");
      }
        
    }

}
