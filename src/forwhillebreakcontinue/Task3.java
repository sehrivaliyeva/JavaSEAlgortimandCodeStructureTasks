package forwhillebreakcontinue;

public class Task3 {
    public static void main(String[] args) {
        //1-den 200-e qeder sade ve murekkeb ededleri cap edin.
        // Nece dene sade nece dene murekkeb eded oldugu tapin.

        int sadeEdedSayi = 0;
        int murekkebEdedSayi = 0;

        for (int i = 2; i <= 200; i++) { //15
            boolean sade = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sade = false;
                    break;
                }
            }

            if (sade) {
                sadeEdedSayi++;
                System.out.println("Ədəd sadədir: " + i);
            } else {
                murekkebEdedSayi++;
                System.out.println("Ədəd mürəkkəbdir: " + i);
            }
        }

        System.out.println("Sadə ədəd sayı: " + sadeEdedSayi);
        System.out.println("Mürəkkəb ədəd sayı: " + murekkebEdedSayi);
    }
}
