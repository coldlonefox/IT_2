package oop.abstractsion.task_Car;

public abstract class Car {
    private String model;
    private String color;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void gas();

    public abstract void brake();

    @Override
    public String toString() {
        return "~~~~~~~~~Car~~~~~~~" + '\n' +
                "Model: " + model + '\n' +
                "Color: " + color + '\n' +
                "MaxSpeed: " + maxSpeed + '\n' ;
    }
}
