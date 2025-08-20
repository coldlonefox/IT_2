package oop.polymorphism.task;

public class Dancer extends Person {
    public Dancer() {
    }

    public Dancer(String name) {
        super(name);
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
