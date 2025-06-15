package LAB5;

public class myFifthApp {
    public static void main(String[] args) {
        printChar('*', 5, 3);
    }

    public static void printChar(char c, int times, int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < times; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
