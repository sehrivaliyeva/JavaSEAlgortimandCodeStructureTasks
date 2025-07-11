package oop;

public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person();
        Person myPersonx = new Person();
        myPerson.age = 20;
        myPerson.name = "Jon";
        myPerson.surname = "Doe";

        Person myPerson2 = new Person("shahrigul", "valiyeva", 28);
        Person myPerson3 = new Person("shahrigul");

    }

}
