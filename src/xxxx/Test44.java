package xxxx;

import java.util.Arrays;

public class Test44 {
    static void main(String[] args) {
        int arr[] = {2, 6, 9, 7, 8, 2, 2, 8, 3};

        for (int i : removeDublicate(arr)) {
            System.out.println(i);
        }

    }

    public static int[] removeDublicate(int[] arr) {
        Arrays.sort(arr);
        int[] newArray = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[j]) {
                newArray[j++] = arr[i];
            }
        }
        newArray[j++] = arr[arr.length - 1];

        int result[] = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = newArray[i];
        }
        return result;
    }
}
