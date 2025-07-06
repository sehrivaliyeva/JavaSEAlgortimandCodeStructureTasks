package ifandswitch;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Menyudan yemək seçin (1‑Pizza, 2‑Burger, 3‑Salat): ");
        int choice = scanner.nextInt();

        System.out.print("Porsiya sayını daxil edin: ");
        int portion = scanner.nextInt();

        double unitPrice;

        switch (choice) {
            case 1:
                unitPrice = 10.0;
                break;
            case 2:
                unitPrice = 7.5;
                break;
            case 3:
                unitPrice = 6.0;
                break;
            default:
                System.out.println("Yanlış seçim!");
                unitPrice = 0;
                break;
        }

        double total = unitPrice * portion;
        System.out.println("Ödənəcək məbləğ:" + total);
    }
}