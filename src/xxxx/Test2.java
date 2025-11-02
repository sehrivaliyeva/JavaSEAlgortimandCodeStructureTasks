package xxxx;

public class Test2 {
    static void main() {
        int arr[][] = {{2, 3, 6}, {5, 9, 8}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
