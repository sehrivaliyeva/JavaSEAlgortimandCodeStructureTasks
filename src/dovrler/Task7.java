package dovrler;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // 1-100 arası təsadüfi ədəd
        int guess = 0;

        System.out.println("1-100 arası ədəd təxmin edin:");

        while (guess != target) {
            guess = sc.nextInt();
            if (guess < target) {
                System.out.println("Daha böyük ədəd daxil edin:");
            } else if (guess > target) {
                System.out.println("Daha kiçik ədəd daxil edin:");
            } else {
                System.out.println("Təbriklər! Doğru ədəd tapıldı: " + target);
            }
        }
    }
}
