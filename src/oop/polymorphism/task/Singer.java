package oop.polymorphism.task;

public class Singer extends Person {
    public Singer() {
    }

    public Singer(String name) {
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
