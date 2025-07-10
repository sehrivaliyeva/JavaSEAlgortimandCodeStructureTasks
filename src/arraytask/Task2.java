package arraytask;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = {2, 8, 9, 7};

        System.out.println("evvelki array");
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int j = 0; j < myArray.length; j++) {
            myArray[j] *= 2;
        }

        System.out.println("artimdan sonraki array");
        for (int j : myArray) {
            System.out.print(j + " ");
        }

    }
}
