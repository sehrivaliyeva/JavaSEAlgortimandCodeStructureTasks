package oop2;

public class Car {
    String mark;
    String model;
    String color;
    int speed;

    public Car() {

    }

    public Car(String x, String model, String color, int speed) {
        this.mark = x;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car(String mark){
        this.mark = mark;
    }


}
