package exercises.E4exercsies.E4;

public class myStringMethods {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    static String reverseString(String string){

        String finished = "";
        for(int i = string.length()-1; i  >= 0; i--){
            finished += string.charAt(i);
        }
        
        return finished;
    }
}
