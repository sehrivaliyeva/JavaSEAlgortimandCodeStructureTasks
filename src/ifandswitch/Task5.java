package ifandswitch;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qiymət (0‑100): ");
        int score = sc.nextInt();

        char grade;
        if (score >= 100)      grade = 'A';
        else if (score >= 80)  grade = 'B';
        else if (score >= 60)  grade = 'C';
        else if (score >= 40)  grade = 'D';
        else                   grade = 'F';

        System.out.println("Kateqoriya: " + grade);
    }
}
