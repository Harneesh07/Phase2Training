class BankAccount {

    static String bankName = "Mariamman Indian Bank";

    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public BankAccount(int accountNumber,
                       String accountHolderName,
                       String mobileNumber,
                       String accountType,
                       double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        }
    }

    public void displayAccountDetails() {

        System.out.println("Bank Name          : " + BankAccount.bankName);
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Account Holder     : " + accountHolderName);
        System.out.println("Mobile Number      : " + mobileNumber);
        System.out.println("Account Type       : " + accountType);
        System.out.println("Balance            : Rs." + balance);
    }
}

public class DesignRequirement {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(
                1001,
                "Arun",
                "9876543210",
                "Savings",
                25000
        );

        BankAccount account2 = new BankAccount(
                1002,
                "Kumar",
                "9876501234",
                "Current",
                50000
        );

        System.out.println("========== ACCOUNT 1 ==========");

        account1.displayAccountDetails();

        System.out.println("\n--- Deposit Rs.5000 ---");
        account1.deposit(5000);

        System.out.println("Updated Balance: Rs." + account1.getBalance());

        System.out.println("\n--- Withdraw Rs.3000 ---");
        account1.withdraw(3000);

        System.out.println("Updated Balance: Rs." + account1.getBalance());

        System.out.println("\n--- Change Mobile Number ---");
        account1.setMobileNumber("9999999999");

        System.out.println("Updated Mobile Number: "
                + account1.getMobileNumber());

        System.out.println("\n--- Negative Deposit ---");
        account1.deposit(-5000);

        System.out.println("\n--- Negative Withdrawal ---");
        account1.withdraw(-3000);

        System.out.println("\n--- Excess Withdrawal ---");
        account1.withdraw(100000);

        System.out.println("\n========== ACCOUNT 2 ==========");

        account2.displayAccountDetails();

        System.out.println("\n--- Deposit Rs.10000 ---");
        account2.deposit(10000);

        System.out.println("\n--- Withdraw Rs.5000 ---");
        account2.withdraw(5000);

        System.out.println("\n--- FINAL ACCOUNT 2 DETAILS ---");
        account2.displayAccountDetails();
    }
}