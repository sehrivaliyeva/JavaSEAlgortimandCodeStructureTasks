package ifandswitch;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Gün nömrəsi (0=Sunday,1=Monday,2=Tuesday,3=Wednesday," +
                "4=Thursday,5=Friday, 6=Saturday): ");
        int current = sc.nextInt();

        System.out.print("Üstünə gələcək gün sayı n: ");
        int n = sc.nextInt();
        int next = (current + n) % 7;

        String day;
        switch (next) {
            case 0 -> day = "Sunday";
            case 1 -> day = "Monday";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            default -> day = "Saturday";
        }

        System.out.println("Yeni gün: " + day);
    }

}