package bankingapplicationtask;

import java.util.Arrays;

public class Bank {
    private Account[] accounts;
    private int accountCount;
    private Transaction[] transactions;
    private int transactionCount;

    public Bank() {
        this.accounts = new Account[10];
        this.transactions = new Transaction[10];
        this.accountCount = 0;
        this.transactionCount = 0;
    }

    public void addAccount(Account account) {
        if (account != null && accountCount < accounts.length) {
            System.out.println("Account elave edildi !!");
            accounts[accountCount++] = account;
        }
    }

    public Account findAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber() == accountNumber) {
                System.out.println("Account tapildi !!");
                return accounts[i];
            }
        }
        System.out.println("Account tapilmasi !!!");
        return null;
    }

    void performTransaction(int accountNumber, double amount, String type) {
        Account account = findAccount(accountNumber);
        if (type.equalsIgnoreCase("deposit")) {
            System.out.println("Tranzaksiya yerine yetirildi !!");
            account.deposit(amount);
        } else {
            System.out.println("Tranzaksiya yerine yetirildi !!");
            account.withdraw(amount);
        }
        transactions[transactionCount++] = new Transaction(transactionCount, type, amount);

    }

    public void printAllAccounts() {
        for (int i = 0; i < accountCount; i++) {
            System.out.println(accounts[i]);
            System.out.println("Accountlar cap olundu !!");
        }
    }












    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getAccountCount() {
        return accountCount;
    }

    public void setAccountCount(int accountCount) {
        this.accountCount = accountCount;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts) +
                ", accountCount=" + accountCount +
                ", transactions=" + Arrays.toString(transactions) +
                ", transactionCount=" + transactionCount +
                '}';
    }


}
