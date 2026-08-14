class Account1 {

    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    public Account1(int accountNumber, String accountHolderName,
                    String mobileNumber, String accountType, double balance) {

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

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
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

public class DataSecurity {

    public static void main(String[] args) {

        Account1 account = new Account1(12345,
                "John Doe",
                "9876543210",
                "Savings",
                10000
        );

        account.display();

//        System.out.println(account.getBalance());
//
//        account.setBalance(50000);
//
//        System.out.println(account.getBalance());
    }
}