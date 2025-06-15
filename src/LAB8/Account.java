package LAB8;

public class Account {
    private String accountNumber;
    private double balance;
    private String owner;
    private String email;
    private String phone;

    public Account(String accountNumber, double balance, String owner, String email, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of PLN " + amount + " was made. New balance PLN " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew PLN " + amount + " from the account, Remaining balance = PLN " + balance);
        } else {
            System.out.println("Insufficient funds. You have PLN " + balance + " in your account.");
        }
    }
}
