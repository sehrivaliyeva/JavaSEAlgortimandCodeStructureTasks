package instanceoff;

public class Test3 {
    public static void main(String[] args) {

        int arr[] = new int[]{2, 4, 6, 8, 10};
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
        System.out.println("----------------------");
        for (
                int i : arr) {
            System.out.println(i);
        }

    }
}