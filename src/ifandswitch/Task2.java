package ifandswitch;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int n = sc.nextInt();

        boolean tip = (n >= 0) ? true :  false ;
        System.out.println("Nəticə: " + tip);
    }
}
