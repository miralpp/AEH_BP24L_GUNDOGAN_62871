package LAB8;

public class myEighthApp {
    public static void main(String[] args) {
        Account acc = new Account("123", 1000, "John", "john@mail.com", "123456789");
        acc.withdraw(900);
        acc.deposit(250);
        acc.withdraw(50);
        acc.withdraw(400);
    }
}
