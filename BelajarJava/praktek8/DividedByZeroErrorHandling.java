import java.util.Scanner;
import java.lang.ArithmeticException;

public class DividedByZeroErrorHandling {

    public static int quotient(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Execute ArithmeticException");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer numerator : ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator : ");

        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("\nResult : %d / %d = %d\n", numerator, denominator, result);
    }
}