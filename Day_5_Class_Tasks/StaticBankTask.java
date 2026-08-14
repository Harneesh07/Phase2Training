public class StaticBankTask {

    static String bankName = "Karur Vysya Bank";

    int accountNumber;

    StaticBankTask(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void display() {
        System.out.println("Account " + accountNumber + " - " + bankName);
    }

    public static void main(String[] args) {

        StaticBankTask account1 = new StaticBankTask(1);
        StaticBankTask account2 = new StaticBankTask(2);
        StaticBankTask account3 = new StaticBankTask(3);

        account1.display();
        account2.display();
        account3.display();
    }
}