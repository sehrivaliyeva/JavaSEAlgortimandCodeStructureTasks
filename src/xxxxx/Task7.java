package xxxxx;

public class Task7 {
     static void main(String[] args) {
        String str = "ababaabab";
        String sub = "aba";
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("\"" + sub + "\" sayı: " + count);
    }
}
