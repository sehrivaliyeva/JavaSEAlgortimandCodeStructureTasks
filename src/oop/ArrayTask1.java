package oop;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 7, 1, 0, 12, 45};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
