import java.util.Scanner;

class BankAccount {
    int accountNo;
    String name, type;
    double balance;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account No: ");
        accountNo = sc.nextInt();

        System.out.print("Name: ");
        name = sc.next();

        System.out.print("Account Type: ");
        type = sc.next();

        System.out.print("Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    void transfer(BankAccount b, double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            b.balance = b.balance + amount;
        }
    }

    void display() {
        System.out.println(accountNo + " " + name + " " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        BankAccount a3 = new BankAccount();

        System.out.println("Account 1");
        a1.accept();

        System.out.println("Account 2");
        a2.accept();

        System.out.println("Account 3");
        a3.accept();

        a1.deposit(10000);
        a2.deposit(5000);

        a1.transfer(a2, 3000);

        a2.withdraw(2000);

        System.out.println("\nFinal Balances");

        a1.display();
        a2.display();
        a3.display();
    }
}
