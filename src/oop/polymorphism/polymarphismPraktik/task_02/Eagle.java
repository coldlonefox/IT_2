package oop.polymorphism.polymarphismPraktik.task_02;

public class Eagle extends  Animal{
    public static final String nameEagle = "Eagle";

    public Eagle() {
    }

    public Eagle(String name) {
        super(name);
    }

    public Eagle(String color, int age, String gender) {
        super(color, age, gender);
    }

    public static void eagle () {
        System.out.println("Eagle king of the sky");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        eagle();
        return super.toString();
    }
}
