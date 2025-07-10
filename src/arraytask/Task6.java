package arraytask;

public class Task6 {
    public static void main(String[] args) {
        int[][] arr = { //jagged array
                {2, 4},
                {8, 4, 1},
                {9, 3, 7},
                {12}
        };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        

    }
}
