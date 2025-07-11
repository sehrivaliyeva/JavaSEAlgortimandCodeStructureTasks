package oop;

public class ArrayTask2 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {5, 4, 3},
                {9, 7, 2}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
