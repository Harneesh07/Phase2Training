class Bank {

    double balance = 10000;


    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void deposit(int amount, String type) {
        balance += amount;
        System.out.println(type + " Deposit: " + amount);
    }


    void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void withdraw(int amount, String type) {
        balance -= amount;
        System.out.println(type + " Withdrawal: " + amount);
    }

    void savings(int amount) {
        balance += amount;
        System.out.println("Savings Added: " + amount);
    }

    int savings(int amount, double interest) {
        double total = amount + (amount * interest / 100);
        balance += total;
        System.out.println("Savings with interest: " + total);
        return (int) total;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class HDFC extends  Bank {

    void displayBalance() {
        System.out.println("HDFC Balance: " + balance);
        System.out.println(savings(1000, 5.0));
    }

}


class MethodOverloading {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.deposit(5000);
        bank.deposit(2000, "Cash");
        bank.withdraw(3000);
        bank.withdraw(1000, "ATM");
        bank.savings(4000);
        bank.savings(3000, 5.0);

        bank.displayBalance();
    }
}
