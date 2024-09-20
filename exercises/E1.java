public class E1 {

    public static void main(String[] args) {
        
    
      String sentence = "I have been in a city";

      int index = sentence.indexOf("the");

      
      
      if (sentence.contains("the")) {
        System.out.println("The word 'the' was found at index "+index);
      }else{
        System.out.println("The word 'the' was not found at all");
      }
    }

}
