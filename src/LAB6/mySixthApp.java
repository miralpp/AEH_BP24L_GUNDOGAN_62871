package LAB6;

public class mySixthApp {
    public static void main(String[] args) {
        int n = 10;

        long startIter = System.nanoTime();
        long iterResult = factorialIterative(n);
        long endIter = System.nanoTime();
        System.out.println("Iterative result: " + iterResult + ", Time: " + (endIter - startIter) + " ns");

        long startRec = System.nanoTime();
        long recResult = factorialRecursive(n);
        long endRec = System.nanoTime();
        System.out.println("Recursive result: " + recResult + ", Time: " + (endRec - startRec) + " ns");
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}
