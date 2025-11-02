package xxxxx;

public class Task1 {
    static void main(String[] args) {
        String sait[] = {"a", "i", "o", "u"};
        String soz = "salaaamm";
        int saitsay = 0;
        int samitsay = 0;

        for (int i = 0; i < soz.length(); i++) {
            char c = soz.charAt(i);
            boolean isSait = false;
            for (int k = 0; k < sait.length; k++) {
                if (c == sait[k].charAt(0)) { // char müqayisəsi
                    isSait = true;
                    break;
                }
            }
            if (isSait) {
                saitsay++;
            } else {
                samitsay++;
            }
        }

        System.out.println(samitsay + " samit say");
        System.out.println(saitsay + " sait say");
    }
}