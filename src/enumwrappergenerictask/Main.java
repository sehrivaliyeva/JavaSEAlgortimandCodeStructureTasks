package enumwrappergenerictask;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("gunu daxil edin ");
            try {
                String soz = input.nextLine().toUpperCase();
                Days days = Days.valueOf(soz);
                days.printType();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}