package xxxxx;

public class Task3 {
     static void main(String[] args) {
        String str = "hedhsk";
        String lowerStr = str.toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < lowerStr.length() / 2; i++) {
            if (lowerStr.charAt(i) != lowerStr.charAt(lowerStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Palindromdur? " + isPalindrome);
    }
}

