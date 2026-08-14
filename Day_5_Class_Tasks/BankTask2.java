

class Account1{
    int accountnumber ;
    String accountHolderName ;

     long mobileNumber;
     String accountType ;
     long balance ;


     public  Account1(int accountnumber , String accountHolderName , long mobileNumber , String accountType , long balance){
         this.accountnumber = accountnumber;
         this.accountHolderName = accountHolderName;
         this.mobileNumber = mobileNumber;
         this.accountType = accountType;
         this.balance = balance ;
     }

     public void display(){
         System.out.println("Account Number : " + accountnumber);
         System.out.println("Account Holder Name : " + accountHolderName);
         System.out.println("Mobile Number : " + mobileNumber);
         System.out.println("Account Type : " + accountType);
         System.out.println("Balance : " + balance);
     }
}



public class BankTask2 {
    public static void main(String[] args) {

        Account1  account1 = new Account1(12345, "John Doe", 9876543210L, "Savings", 10000L);
        Account1 account2 = new Account1(67890, "Jane Smith", 9876543211L, "Current", 5000L);
        Account1 account3 = new Account1(54321, "Alice Johnson", 9876543212L, "Savings", 20000L);

        account1.display();
        account2.display();
        account3.display();

    }
}
