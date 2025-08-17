package oop.tasks.modifiers;

public class Circle {
    private double PI = Math.PI;
    private int radius;

    public Circle() {
    }
    public Circle(int PI, int radius) {
        this.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
    public void setPI(double PI) {
        this.PI = PI;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void area (Circle circle) {
        System.out.println("PI: " + circle.getPI() + "\n" +
                           "Radius: " + circle.getRadius() + "\n");
        System.out.println("Area: " + circle.getPI() * (circle.getRadius() * circle.getRadius() ) );
    }
    public static void circumference (Circle circle) {
        System.out.println("PI: " + circle.getPI() + "\n" +
                           "Radius: " + circle.getRadius() + "\n");
        System.out.println("Circumference: " + circle.getPI() * 2 * circle.getRadius());
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~Circle~~~~~~~~~~\n" +
                "PI: " + PI + "\n" +
                "Radius: " + radius + "\n" ;
    }
}
