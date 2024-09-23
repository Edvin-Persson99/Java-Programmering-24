package exercises.E4exercsies;

public class myMathMethods {

    public static void main(String[] args) {
        calculateFactorial(5);
        calculateFibonacci(4);
    }

    static void calculateFactorial(int number){

        

        int i, fact = 1;
        for(i = 1; i <= number; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    static void calculateFibonacci(int number){

        int num1 = 0, num2 = 1;

        for (int i = 0; i < number; i++) {
            // Print the number
            System.out.print(num1 + " ");
            //0, 1, 1
            // Swap
            int num3 = num2 + num1;// 1, 1, 2  
            num1 = num2; // 1, 1
            num2 = num3;// 1, 1
        }
        
    }

}
