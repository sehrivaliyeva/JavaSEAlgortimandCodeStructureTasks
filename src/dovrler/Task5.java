package dovrler;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }

        System.out.println("Perfect ədəddir? " + (sum == num));
    }
}
