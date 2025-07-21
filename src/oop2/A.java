package oop2;

public class A {
     int b = 10;

    public  void changeB(int newValue) {
        newValue=3;
    }

    public static void main(String[] args) {
       A a=new A();
       a.changeB(300);
        System.out.println(a.b);
    }
}
