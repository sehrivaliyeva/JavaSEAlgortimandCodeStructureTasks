package arraytask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Arrayimiz yarandi ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "- indexine element menimedin !");
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
        }

        System.out.println("Yekun arrayimiz hazirdir !");
        for (int eded : array) {
            System.out.print(eded + " ");
        }
    }
}
