package dovrler;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ədəd: ");
        int a = sc.nextInt();
        System.out.print("İkinci ədəd: ");
        int b = sc.nextInt();

        int ebob = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ebob= i;
            }
        }

        System.out.println("ƏBOB (GCD): " + ebob);
    }
}
