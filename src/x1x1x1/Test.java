package x1x1x1;

public class Test {
    static void main() {

        int[] arr = {1, 3, 5};
        int[] arr2 = new int[]{2, 8};
        int[] arr3 = new int[10];

        int arr4[][] = new int[][]{{8, 7, 5}, {9, 7, 8, 4, 3}, {8, 8}};


        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }

    }
}
