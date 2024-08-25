/**
 * A class that provides methods for calculating Fibonacci sequence terms.
 */
public class Fibonacci {

    /**
     * Computes the nth term in the Fibonacci sequence using recursion.
     *
     * @param n the index of the term in the Fibonacci sequence to compute
     * @return the nth term in the Fibonacci sequence
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Main method to demonstrate the Fibonacci sequence calculation.
     * It calculates and prints the 10th term in the Fibonacci sequence.
     *
     * @param args command-line arguments (not used in this method)
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
