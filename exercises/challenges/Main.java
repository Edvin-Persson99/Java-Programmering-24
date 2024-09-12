package exercises.challenges;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number between 1-7 here: ");
        int number = scanner.nextInt();
        while (number < 1 || number > 7) {
            System.out.print("Write a number between 1-7 here: ");
            number = scanner.nextInt();
        } 

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                  System.out.println("Tuesday");
                  break;
            case 3:
                  System.out.println("Wednesday");
                  break;
            case 4:
                  System.out.println("Thursday");
                  break;
            case 5:
                 System.out.println("Friday");
                  break;
            case 6:
                  System.out.println("Saturday");
                  break;
            case 7:
                 System.out.println("Sunday");
                 break;
           
        }
    }

}
