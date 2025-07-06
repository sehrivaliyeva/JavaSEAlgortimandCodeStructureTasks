package forwhillebreakcontinue;

public class Task4 {
    public static void main(String[] args) {
        //30dan 90a qeder hem 2ye hem de 5e bolunen ededleri tapin
        // hem for hem de while ile hell etmek mumkundur

        for (int eded = 30; eded < 90; eded++) {
            if (eded % 2 == 0 && eded % 5 == 0) {
                System.out.println(eded);
            }
        }

        int eded = 30;
        while (eded < 90) {
            if (eded % 2 == 0 && eded % 5 == 0) {
                System.out.println(eded);}
            eded++;

        }

    }
}
