class Account1 {

    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public Account1(int accountNumber,
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

    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
    }
}

public class ConstructorRequirement {

    public static void main(String[] args) {

        Account1 account = new Account1(
                1001,
                "Arun",
                "9876543210",
                "Savings",
                25000
        );

        account.display();
    }
}