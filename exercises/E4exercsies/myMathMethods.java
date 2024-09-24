package exercises.E4exercsies;

public class myMathMethods {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
        System.out.println(calculateFibonacci(4));
        System.out.println(primeChecker(8));
      
    }

    static int calculateFactorial(int number){

        

        int factorial = 1;

        if (number < 0) {
            System.out.println("Error: factorial is undefined for negative integers");
            return 0;
        }

        if (number == 0) {
            factorial = 1;
            return factorial;
        }

        for (int i = 1; i <= number; i++) {
            // i = 1, 2, 3, 4, 5
            factorial = factorial * i; // 1, 2, 6, 24
        }

        return factorial;
    }

    static int calculateFibonacci(int number){

        if (number <= 0) {
            throw new IllegalArgumentException("Position must be a positive integer.");
        }

        if (number == 1 || number == 2) {
            return number - 1;
        }

        int previous = 0;
        int current = 1;
        int fibonacci = 0;

        for (int i = 3; i <= number; i++) {
            fibonacci = previous + current; // 1  2
            previous = current; // 1 1
            current = fibonacci; // 1 1
        }

        return fibonacci;
    }

     static boolean primeChecker(int number) {
        boolean isPrime = true;

        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++)
            if (number % i == 0) {
                isPrime = false;
            }
        return isPrime;
    }

    
    
}
    


