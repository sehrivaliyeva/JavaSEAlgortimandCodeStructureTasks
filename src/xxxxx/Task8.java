package xxxxx;

public class Task8 {
     static void main(String[] args) {
        String str = "example.txt";
        String prefix = "ex";
        String suffix = "txt";

        boolean result = str.startsWith(prefix) && str.endsWith(suffix);
        System.out.println("Prefix və suffix uyğun? " + result);
    }
}
