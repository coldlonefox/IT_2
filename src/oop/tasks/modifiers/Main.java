package oop.tasks.modifiers;

public class Main {
    public static void main(String[] args) {

        Circle circle2 = new Circle();
        circle2.setRadius(5);

        System.out.println("~~~~~~~~~~Area~~~~~~~~~~");
        Circle.area(circle2);

        System.out.println("\n~~~~~~~~~~Circumference~~~~~~~~~~");
        Circle.circumference(circle2);


    }
}
