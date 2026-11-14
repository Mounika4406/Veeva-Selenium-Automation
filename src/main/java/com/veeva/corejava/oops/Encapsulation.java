
class BankAccount {

    // Private variable: cannot be accessed directly outside this class
    private double balance;

    // Method to set the initial balance
    public void setBalance(double amount) {

        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(1000);

        account.deposit(500);

        System.out.println("Current Balance: " + account.getBalance());
    }
}
