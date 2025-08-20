package oop.abstractsion.task_Car;

public class Bmw extends Car{
    public Bmw() {
    }

    public Bmw(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println(" ДОбавит скорость  ");
    }

    @Override
    public void brake() {
        System.out.println(" Реско астановится ");
    }

}
