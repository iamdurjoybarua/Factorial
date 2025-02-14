import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a non-negative integer: ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                System.out.println("The factorial of " + number + " is: " + factorial);
            }

        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
