package LAB2;

import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {
        double x = 10;
        double y = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("Enter two numbers:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));

    }
}
