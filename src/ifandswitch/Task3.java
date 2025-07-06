package ifandswitch;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int n = sc.nextInt();

        System.out.println((n % 2 == 0) ? "Cüt ədəddir" : "Tək ədəddir");
    }
}
