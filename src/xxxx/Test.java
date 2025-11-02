package xxxx;

import java.util.Arrays;

public class Test {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.println("Birinci massiv: " + Arrays.toString(arr1));
        System.out.println("İkinci massiv: " + Arrays.toString(arr2));

        int[] common = findCommonElements(arr1, arr2);

        System.out.println("Ortaq elementlər: " + Arrays.toString(common));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {

        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean alreadyAdded = false;
                    for (int m = 0; m < k; m++) {
                        if (temp[m] == arr1[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        temp[k++] = arr1[i];
                    }
                }
            }
        }


        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}

