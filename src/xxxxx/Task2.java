package xxxxx;

public class Task2 {
    static void main(String[] args) {
        String str = "Hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Tərs çevrilmiş: " + reversed);
    }
}
