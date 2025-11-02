package xxxxx;

public class Task5 {
    public static void main(String[] args) {
        String str = "Bu bir test cümləsidir";
        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Ən uzun söz: " + longest);
    }
}
