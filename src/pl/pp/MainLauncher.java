package pl.pp;

import LAB1.myFirstApp;
import LAB10.myTenthApp;
import LAB11.myEleventhApp;
import LAB12.myTwelfthApp;
import LAB2.mySecondApp;
import LAB3.myThirdApp;
import LAB4.myFourthApp;
import LAB5.myFifthApp;
import LAB6.mySixthApp;
import LAB7.mySeventhApp;
import LAB8.myEighthApp;
import LAB9.myNinthApp;

import java.util.Scanner;

public class MainLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a Lab to run (1–12), or 0 to exit:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                case 1 -> myFirstApp.main(null);
                case 2 -> mySecondApp.main(null);
                case 3 -> myThirdApp.main(null);
                case 4 -> myFourthApp.main(null);
                case 5 -> myFifthApp.main(null);
                case 6 -> mySixthApp.main(null);
                case 7 -> mySeventhApp.main(null);
                case 8 -> myEighthApp.main(null);
                case 9 -> myNinthApp.main(null);
                case 10 -> myTenthApp.main(null);
                case 11 -> myEleventhApp.main(null);
                case 12 -> myTwelfthApp.main(null);
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
