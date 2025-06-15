package LAB4;

import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter lower and upper integer limits:");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }
            System.out.println("The sums of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + sum);
        }

        while (true) {
            System.out.println("Choose operation: 1-add, 2-subtract, 3-multiply, 4-divide");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                continue;
            }

            System.out.println("Enter two numbers:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("Result: " + (a + b));
                case 2 -> System.out.println("Result: " + (a - b));
                case 3 -> System.out.println("Result: " + (a * b));
                case 4 -> {
                    if (b != 0) System.out.println("Result: " + (a / b));
                    else System.out.println("Cannot divide by zero");
                }
            }
        }
    }
}
