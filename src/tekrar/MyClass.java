package tekrar;

public class MyClass {
    static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int element : arr) {
            System.out.println(element);
        }

    }
}
