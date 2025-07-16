package oop2;

public class Test3 {
    int a;

    public void foo(Test3 test3) {
        test3.a = 5;
    }

    public  void foo2(int eded) {
        eded=7;
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        System.out.println(test3.a);

        int eded=3;
        test3.foo2(eded);
        System.out.println(eded);
    }

}