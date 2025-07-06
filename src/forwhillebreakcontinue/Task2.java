package forwhillebreakcontinue;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //ededin polindrom olub olmamasini yoxlayag
        // Scanner sc = new Scanner(System.in);
        int eded = 123;
        int original = eded;
        int reversed = 0;

        while (eded > 0) {
            int reqem = eded % 10;// qaliq 3 qaliq 2 1
            reversed = reversed * 10 + reqem; // 0+3=3    321
            eded = eded / 10; //12  1
        }

        if (original == reversed) {
            System.out.print("eded polindromdur");
        } else {
            System.out.print("eded polindrom deyil");
        }

    }
}
