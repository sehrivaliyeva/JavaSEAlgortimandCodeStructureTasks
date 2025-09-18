package bankingapplicationtask;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
}
