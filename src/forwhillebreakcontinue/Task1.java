package forwhillebreakcontinue;

public class Task1 {
    public static void main(String[] args) {
        //10 ededinin factorialini hesablayin
        int eded = 10;
        int factorial=1;
        for (int i = eded; i > 0; i--) {
            factorial=factorial * i;
        }
        System.out.println(factorial);
    }
}
