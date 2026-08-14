class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    static String bankName = "Mariamman Indian Bank";

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

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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

    public void display() {

        System.out.println("Bank Name          : " + BankAccount.bankName);
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Account Holder     : " + accountHolderName);
        System.out.println("Mobile Number      : " + mobileNumber);
        System.out.println("Account Type       : " + accountType);
        System.out.println("Balance            : Rs." + balance);
    }
}

public class DisplayDetails {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(
                1001,
                "Arun",
                "9876543210",
                "Savings",
                25000
        );

        System.out.println("========== ACCOUNT 1 ==========");

        account1.display();


    }
}