package arraytask;

public class Task1 {
    public static void main(String[] args) {

        int sum = 0;
        int[] arr = new int[20];

        //bunu manual da ede bilersiniz
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int a : arr) {// for each
            if (a % 3 == 0) {
                sum =sum+a;
            }
        }

        System.out.println(sum);
    }


}
