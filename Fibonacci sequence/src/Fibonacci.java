import java.util.Scanner;

/**
 * A class that provides methods for calculating Fibonacci sequence terms.
 */
public class Fibonacci {

    /**
     * Computes the nth term in the Fibonacci sequence using an iterative approach.
     *
     * @param n the index of the term in the Fibonacci sequence to compute
     * @return the nth term in the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev1 = 0, prev2 = 1, current = 1;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    /**
     * Main method to demonstrate the Fibonacci sequence calculation.
     * It calculates and prints the nth term in the Fibonacci sequence based on user input.
     *
     * @param args command-line arguments (not used in this method)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the term number (n) of the Fibonacci sequence you want to calculate: ");
        int n = scanner.nextInt();

        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
