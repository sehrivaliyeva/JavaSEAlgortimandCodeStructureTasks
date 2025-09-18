package bankingapplicationtask;

import java.io.Serializable;

public abstract class Account implements Serializable {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("duzgun depozit meblegi qeyd edin ");
        }
    }

    abstract void withdraw(double amount);

    abstract void displayAccountInfo();

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

