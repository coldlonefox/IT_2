package oop.tasks.polymorphism_task_lms.task_Animal;

public class Eagle extends Animal {
    public static final String nameEagle = "Eagle";

    public Eagle() {
    }

    public Eagle(String name) {
        super(name);
    }

    public Eagle(String color, int age, String gender) {
        super(color, age, gender);
    }

    public static void fly () {
        System.out.println("Eagle king of the sky");
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
