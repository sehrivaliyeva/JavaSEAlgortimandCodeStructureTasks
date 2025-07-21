package practise;

public class MyClass {
    int eded1;// obyekt deyiseni
    static int eded2; // class deyisenleri

    public static void main(String[] args) {
        MyClass mySinif = new MyClass();
        mySinif.eded1 = 10;
        mySinif.eded2 = 40;
        MyClass.eded2 = 20;

    }


}
