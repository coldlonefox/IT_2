package oop.Inculation.task1;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setName("Квадрат");
        rectangle.seta(3L);
        rectangle.setb(8L);

        System.out.println("Name: "+rectangle.getName());
        Long summa = rectangle.geta()* rectangle.getb();
        System.out.println("аянты: "+rectangle.geta()+" * "+rectangle.getb()+" = "+summa);
    }
}