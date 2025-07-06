package ifandswitch;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Əməliyyatı seçin (1.+, 2.-, 3.*, 4./): ");
        int op = sc.nextInt();

        System.out.print("Birinci ədədi daxil edin: ");
        double a = sc.nextDouble();
        System.out.print("İkinci ədədi daxil edin: ");
        double b = sc.nextDouble();

        double result;
        switch (op) {
            case 1: result = a + b; break;
            case 2: result = a - b; break;
            case 3: result = a * b; break;
            case 4: result = (b != 0) ? a / b : Double.NaN; break;
            default:
                System.out.println("Yanlış əməliyyat seçildi!");
                return;
        }
        System.out.println("Nəticə: " + result);
    }
}
