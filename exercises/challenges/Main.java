package exercises.challenges;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Write a number here: ");
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        
        if (number == 0) {
            System.out.println("0");
        }
        if (number % 2 == 0) {
            System.out.println("Positive");
        }
        if (number % 2 != 0) {
            System.out.println("Negative");
        }
    }

}
