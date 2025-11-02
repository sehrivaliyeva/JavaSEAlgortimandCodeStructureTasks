package oop;

public class Person {
    // class adlari Pascal Case, metod ve field adlari Camel case myMethod
    //myField

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        System.out.println("person created3");
    }

    public Person() {
        System.out.println("xxxxx.Person constructor");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("xxxxx.Person constructor22");
    }

    public void calculateMethod() {
        int a = 5;
        System.out.println(a);
        System.out.println("method icra olundu");
    }

    public int printAge() {
        int a = age * 2;
        return a;
    }

}
