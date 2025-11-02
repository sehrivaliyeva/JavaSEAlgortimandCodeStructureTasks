package dovrler;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seriyanın uzunluğunu daxil edin: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Fibonacci seriyası: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
