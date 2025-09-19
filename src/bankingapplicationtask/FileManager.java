package bankingapplicationtask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileManager {

    void saveAccountsToFile(Account[] accounts, int accountCount) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("accounts.txt"))) {
            oos.writeInt(accountCount);
            for (int i = 0; i < accountCount; i++) {
                oos.writeObject(accounts[i]);
            }
            System.out.println("accountlar fayla yazildi");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Account[] loadAccountsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("accounts.txt"))) {
            int count = ois.readInt();
            Account[] accounts = new Account[count];
            for (int i = 0; i < count; i++) {
                accounts[i] = (Account) ois.readObject();
            }
            System.out.println("Accounts loaded from file.");
            return accounts;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No saved accounts found.");
            return new Account[0];
        }
    }

    public void saveTransactionsToFile(Transaction[] transactions, int count) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transactions.txt"))) {
            oos.writeInt(count);
            for (int i = 0; i < count; i++) {
                oos.writeObject(transactions[i]);
            }
            System.out.println("Transactions saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Transaction[] loadTransactionsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transactions.txt"))) {
            int count = ois.readInt();
            Transaction[] transactions = new Transaction[count];
            for (int i = 0; i < count; i++) {
                transactions[i] = (Transaction) ois.readObject();
            }
            System.out.println("Transactions loaded from file.");
            return transactions;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No saved transactions found.");
            return new Transaction[0];
        }
    }
}
