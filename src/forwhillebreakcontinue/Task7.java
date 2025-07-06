package forwhillebreakcontinue;

public class Task7 {
    public static void main(String[] args) {
//15-den 25-e qeder ededlerden ilk hem 4e hem de
// 5e bolunen ededi tapin ve sonra dovr dayansin

        for (int i = 15; i <= 25; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
