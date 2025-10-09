package enumwrappergenerictask;

public enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void printType() {
        switch (this) {
            case SATURDAY, SUNDAY: {
                System.out.println("istirahet gunudur");
                break;
            }
            case MONDAY, TUESDAY,
                 WEDNESDAY, THURSDAY, FRIDAY: {
                System.out.println("is gunudur");
                break;
            }
            default: {
                System.out.println("dogru secim deyil !");
                break;
            }
        }
    }
}
