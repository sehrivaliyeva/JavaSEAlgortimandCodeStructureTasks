package oop;

public class Cat {
    String name;
    String color;
    int age;

    //default olaraq parametrsiz constructor olur arxada
    public Cat() {
        System.out.println("Cat Constructor 1");
    }

    public Cat(String name) {
        this.name = name;
        System.out.println("Cat Constructor 2");
    }

    public Cat(String x, String reng, int yash) {
        this.name = x;
        this.color = reng;
        this.age = yash;
        System.out.println("Cat Constructor 3");
    }

    public void run() {
        System.out.println("Cat is running");
    }

    public int showAge() {
        return age;
    }

    public String showName() {
        return name;
    }


}
