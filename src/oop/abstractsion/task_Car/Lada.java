package oop.abstractsion.task_Car;

public class Lada extends Car {
    public Lada() {
    }

    public Lada(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println(" Ехать пирёт ");
    }

    @Override
    public void brake() {
        System.out.println(" Остановится ");
    }
}
