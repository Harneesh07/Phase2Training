// BankAccountSystem.java

abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor 1
    BankAccount(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0;
    }

    // Constructor 2
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    abstract void withdraw(double amount);

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}


// Savings Account
class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Minimum balance ₹1000
    void withdraw(double amount) {

        if (getBalance() - amount >= 1000) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Cannot withdraw.");
            System.out.println("Minimum balance of ₹1000 must be maintained.");
        }
    }
}


// Current Account
class CurrentAccount extends BankAccount {

    CurrentAccount(int accountNumber, String holderName) {
        super(accountNumber, holderName);
    }

    CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Overdraft limit ₹5000
    void withdraw(double amount) {

        if (getBalance() - amount >= -5000) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Overdraft limit of ₹5000 exceeded.");
        }
    }
}


// Main class
public class BankAccountSystem {

    public static void main(String[] args) {

        // Polymorphism
        BankAccount savings =
                new SavingsAccount(101, "Rahul", 5000);

        BankAccount current =
                new CurrentAccount(102, "Arun", 2000);


        System.out.println("----- SAVINGS ACCOUNT -----");

        savings.displayDetails();

        savings.deposit(1000);

        savings.withdraw(4500);

        savings.displayDetails();


        System.out.println("\n----- CURRENT ACCOUNT -----");

        current.displayDetails();

        current.deposit(1000);

        current.withdraw(7000);

        current.displayDetails();
    }
}