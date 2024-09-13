package exercises.challenges;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        try {
            int number = scanner.nextInt();
            for(int i = 1; i <= 10; i++){
                System.out.println(number * i);
            }
        } catch (Exception e) {
            System.out.println("Your input has the be a number");
        }
        
    }

}
