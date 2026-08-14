class Account1 {

    static String bankName = "Karur Vysya Bank";

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


    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("deposited" +  balance);
        }
        else {
            System.out.println("invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount ;
            System.out.println("withdraw sucessfull" + balance);
        }
        else{
            System.out.println("invalid amount");
        }
    }

    public void display() {
        System.out.println("bank name" + Account1.bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);

    }
}

public class MainMethodRequirement {

    public static void main(String[] args) {

        Account1 account = new Account1(
                1001,
                "Arun",
                "9876543210",
                "Savings",
                25000
        );

        Account1 account1 = new Account1(
                1001,
                "Arun",
                "9876543210",
                "Savings",
                25000
        );

        account.display();
        account1.display();
    }
}