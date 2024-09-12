package exercises.challenges;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Write a number here: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is zero");
        }else if(number % 2 == 0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }



    }

}
