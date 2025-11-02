package dovrler;

import java.util.Scanner;

public class Task3 {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ədəd: ");
        int a = sc.nextInt();
        System.out.print("İkinci ədəd: ");
        int b = sc.nextInt();

        int ebob = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
        }

        int lcm = (a * b) / ebob;
        System.out.println("ƏKOB: " + lcm);
    }
}
