package oop2;

public class Test {
    int a;
    int z;

    public void foo(Test x) {
        x.a = 3;

    }

    public  void method(int x) {
        x = 5;
        System.out.println(x);

    }

    public static void main(String[] args) {
       /* Test test1 = new Test();// heap a=85  test/stack
        test1.foo(test1);
        test1.a = 85;
        System.out.println(test1.a);*/

        Test test2 = new Test();
        test2.z = 9;
        test2.method(test2.z);
        System.out.println(test2.z);


    }

}
