package Bank_Account;

public class Bank {
    public static void main(String[] args) {
        String accountHolder = "Harika CH";
        double balance = 5000.0;
        double deposit = 2000.0;
        double withdrawal = 1000.0;
        boolean isActive = true;
        boolean validDeposit = deposit > 0;
        int transactions = 0;

        if (validDeposit && isActive) {
            balance += deposit;
            transactions++;
        }

        if (withdrawal > 0 && withdrawal <= balance) {
            balance -= withdrawal;
            transactions++;
        }

        boolean lowBalance = balance < 1000;

        System.out.println("=== Bank Account Summary ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Final Balance: ₹" + balance);
        System.out.println("Low Balance Alert: " + lowBalance);
        System.out.println("Total Transactions: " + transactions);
    }
}