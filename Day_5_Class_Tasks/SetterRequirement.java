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


    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber ;
    }
    public  String getMobileNumber(){
        return mobileNumber ;
    }

    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Account Type : " + accountType);
        System.out.println("Balance : " + balance);
    }
}

public class SetterRequirement {

    public static void main(String[] args) {

        Account1 account = new Account1(
                1001,
                "Arun",
                "9876543210",
                "Savings",
                25000
        );

        System.out.println(account.getMobileNumber());

        account.setMobileNumber("345425423");

        System.out.println(account.getMobileNumber());






    }
}