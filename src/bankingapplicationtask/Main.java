package bankingapplicationtask;

import java.util.Scanner;

public class Main {
    static void main() {


        Bank bank = new Bank();
        FileManager fileManager = new FileManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--- Banking Menu ---");
            System.out.println("1. Yeni hesab aç");
            System.out.println("2. Pul yatır");
            System.out.println("3. Pul çıxart");
            System.out.println("4. Hesabları göstər");
            System.out.println("5. Fayla yaz / fayldan oxu");
            System.out.println("6. Çıxış");
            System.out.print("Seçim: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Hesab nömrəsi: ");
                    int accNum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Sahibin adı: ");
                    String holder = sc.nextLine();
                    System.out.print("Balans: ");
                    double balance = sc.nextDouble();
                    System.out.print("1 - Savings, 2 - Current: ");
                    int type = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Faiz dərəcəsi: ");
                        double rate = sc.nextDouble();
                        bank.addAccount(new SavingAccount(accNum, holder, balance, rate));
                    } else {
                        System.out.print("Overdraft limiti: ");
                        double limit = sc.nextDouble();
                        bank.addAccount(new CurrentAccount(accNum, holder, balance, limit));
                    }
                    break;

                case 2:
                    System.out.print("Hesab nömrəsi: ");
                    int accNumD = sc.nextInt();
                    System.out.print("Məbləğ: ");
                    double dep = sc.nextDouble();
                    bank.performTransaction(accNumD, dep, "DEPOSIT");
                    break;

                case 3:
                    System.out.print("Hesab nömrəsi: ");
                    int accNumW = sc.nextInt();
                    System.out.print("Məbləğ: ");
                    double wd = sc.nextDouble();
                    bank.performTransaction(accNumW, wd, "WITHDRAW");
                    break;

                case 4:
                    bank.printAllAccounts();
                    break;

                case 5:
                    System.out.println("1. Fayla yaz");
                    System.out.println("2. Fayldan oxu");
                    int subChoice = sc.nextInt();

                    if (subChoice == 1) {
                        fileManager.saveAccountsToFile(bank.getAccounts(), bank.getAccountCount());
                        fileManager.saveTransactionsToFile(bank.getTransactions(), bank.getTransactionCount());
                    } else if (subChoice == 2) {
                        Account[] loadedAccounts = fileManager.loadAccountsFromFile();
                        Transaction[] loadedTransactions = fileManager.loadTransactionsFromFile();

                        System.out.println("\n--- Fayldan Oxunan Hesablar ---");
                        for (Account acc : loadedAccounts) {
                            if (acc != null) {
                                System.out.println(acc);
                            }
                        }

                        System.out.println("\n--- Fayldan Oxunan Əməliyyatlar ---");
                        try {


                            for (Transaction tr : loadedTransactions) {
                                if (tr != null) {
                                    System.out.println(tr);
                                }
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Yanlış seçim!");
                    }
                    break;

                case 6:
                    System.out.println("Çıxış edildi.");
                    sc.close();
                    return;

                default:
                    System.out.println("Yanlış seçim!");
            }
        }
    }

}
