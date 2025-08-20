package oop.polymorphism.task;

public class Programmer extends Person {
    public Programmer() {
    }

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void walk() {
        System.out.println("Coding "+getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
