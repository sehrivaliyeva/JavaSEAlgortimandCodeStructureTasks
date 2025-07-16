package oop2;

public class User {
    String name;
    String surname;
    int age;
    Post post;

    public User(String name, String surname, int age, Post post) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.post = post;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", post=" + post +
                '}';
    }


}
