
import java.util.Scanner;

public class ATMSystem {

    static Scanner sc = new Scanner(System.in);

    static int accountNumber = 1001;
    static int pin = 1234;
    static String name = "Rahul";
    static double balance = 30000;

    public static void main(String[] args) {

        System.out.println("----- ATM SYSTEM -----");

        System.out.println("1. Insert Card");
        System.out.println("2. Enter PIN");
        System.out.println("3. Check Balance");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Deposit Money");
        System.out.println("6. Display Account Details");
        System.out.println("7. Exit");

        System.out.print("\nEnter Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (acc == accountNumber && enteredPin == pin) {

            System.out.println("\nLogin Successful!");

            int choice;

            do {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Account Details");
                System.out.println("5. Exit");

                System.out.print("\nEnter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Balance: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount: ₹");
                        double withdraw = sc.nextDouble();

                        if (withdraw <= balance) {
                            System.out.println("Processing...");
                            balance = balance - withdraw;

                            System.out.println("₹" + withdraw +
                                    " withdrawn successfully.");
                            System.out.println("Remaining Balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient Balance.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount: ₹");
                        double deposit = sc.nextDouble();

                        balance = balance + deposit;

                        System.out.println("₹" + deposit +
                                " deposited successfully.");
                        System.out.println("Current Balance: ₹" + balance);
                        break;

                    case 4:
                        System.out.println("\n----- ACCOUNT DETAILS -----");
                        System.out.println("Account Number: " + accountNumber);
                        System.out.println("Name: " + name);
                        System.out.println("Balance: ₹" + balance);
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 5);

        } else {
            System.out.println("\nInvalid Account Number or PIN.");
        }

        sc.close();
    }
}