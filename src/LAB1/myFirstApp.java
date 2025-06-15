package LAB1;

import java.util.Scanner;

public class myFirstApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String forename = scanner.nextLine();
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Welcome " + forename + " " + surname);

    }
}
