package Bank;

public class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public synchronized boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }


    public synchronized void deposit(double amount) {
        this.balance += amount;
    }

    public synchronized double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}