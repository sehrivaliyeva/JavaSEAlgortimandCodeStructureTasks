package oop2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi");
        System.out.println(car.model);
        System.out.println(car.mark);

        Post post = new Post("XX", "eladir", 25, 128);
        User user = new User("sehrigul", "Valiyeva", 28, post);
        System.out.println(user);
    }
}
