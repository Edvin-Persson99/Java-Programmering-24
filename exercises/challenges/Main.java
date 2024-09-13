package exercises.challenges;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a letter here: ");
        String VOWELS = "aeiouåäöAEIOUÅÄÖ";
        String Consonants = "bcdfghjklmnpqrstvxzBCDFGHJKLMNPQRSTVXZ";

        String charachter = scanner.nextLine();

        while (charachter.length() != 1) {
            System.out.println("You can only have one letter");
            System.out.print("Write a letter here: ");
            charachter = scanner.nextLine();
        }
        
        if (VOWELS.contains(charachter)) {
            System.out.println(charachter+" is a vowel");
        }

        if (Consonants.contains(charachter)) {
            System.out.println(charachter+ " is a charachter");
        }

        else if (!Consonants.contains(charachter)&&!VOWELS.contains(charachter)) {
            System.out.println("You did the wrong thing");
        }
    }

}
