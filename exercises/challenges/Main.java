package exercises.challenges;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.print("Write a number here: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the first number here: ");
        int number1 = scanner.nextInt();

        System.out.print("Write the second number here: ");
        int number2 = scanner.nextInt();

        System.out.print("Write the third number here: ");
        int number3 = scanner.nextInt();

        

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are the same");
        }

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1+" is the biggest number");
        }


        if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is the biggest number");
        }

        if (number3 > number1 && number3 > number2) {
            System.out.println(number3 + " is the biggest number");
        }
    }

}
