package enumwrappergenerictask;

public enum Color implements Renglenebilen {

    RED(5) {
        @Override
        public void rengle() {
            System.out.println("rengle red");
        }
    }, BLUE(6) {
        @Override
        public void rengle() {
            System.out.println("rengle mavi");
        }
    }, GREEN(9) {
        @Override
        public void rengle() {
            System.out.println("rengle yasil");
        }
    };

    int a;

    static {
        System.out.println("static blok");
    }

    Color(int a) {
        this.a = a;
    }

    {
        System.out.println("obyekt bloku");
    }



}
