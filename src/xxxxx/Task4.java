package xxxxx;

public class Task4 {
     static void main(String[] args) {
        String str = "Java Proqramlaşdırma";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println("Boşluqsuz: " + result);
    }
}
