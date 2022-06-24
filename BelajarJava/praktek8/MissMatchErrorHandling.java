import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class MissMatchErrorHandling {
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
        int numerator = 0;
        try {
            numerator = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Execute InputMismatchException on numerator");
        }
        System.out.println("Numerator : " + numerator);

        System.out.print("Please enter an integer denominator : ");
        int denominator = 0;
        try {
            denominator = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Execute InputMismatchException on denominator");
        }
        System.out.println("Denominator : " + denominator);

        int result = quotient(numerator, denominator);
        System.out.printf("\nResult : %d  / %d = %d\n", numerator, denominator, result);
    }
}
