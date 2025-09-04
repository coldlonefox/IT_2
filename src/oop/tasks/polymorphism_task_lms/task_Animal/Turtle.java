package oop.tasks.polymorphism_task_lms.task_Animal;

public class Turtle extends Animal {
    public static final String nameTurtle = "Turtle";

    public Turtle() {
    }

    public Turtle(String name) {
        super(name);
    }

    public Turtle(String color, int age, String gender) {
        super(color, age, gender);
    }

    public static void swim () {
        System.out.println("Turtle swims in ocean");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
