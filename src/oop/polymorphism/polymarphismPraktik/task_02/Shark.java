package oop.polymorphism.polymarphismPraktik.task_02;

public class Shark extends Animal{
    public static final String nameShark = "Shark";

    public Shark() {
    }

    public Shark(String name) {
        super(name);
    }

    public Shark(String color, int age, String gender) {
        super(color, age, gender);
    }

    public static void attack () {
       System.out.println("Shark swims");
   }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        attack();
        return super.toString() ;

    }
}
