package xxxx;

public class Testtt {
    static void main(String[] args) {
        int arr[] = {5, 2, 4, 8, 1, 11, 4};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("en boyuk element : "+max);
    }
}
