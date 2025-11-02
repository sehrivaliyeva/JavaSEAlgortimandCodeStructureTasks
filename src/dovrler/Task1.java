package dovrler;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int num = sc.nextInt();
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Sadə ədəddir? " + isPrime);
    }
}
