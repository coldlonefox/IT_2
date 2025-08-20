package oop.abstractsion.task_Car;

public class Main {
    public static void main(String[] args) {
        Lada lada = new Lada();
        lada.setModel("Жигули");
        lada.setColor("Blue");
        lada.setMaxSpeed(180);

        System.out.println(lada);
        System.out.println("Gas");
        lada.gas();
        System.out.println("Brake");
        lada.brake();

        Bmw bmw = new Bmw();
        bmw.setModel("M5");
        bmw.setColor("Black");
        bmw.setMaxSpeed(280);

        System.out.println(bmw);
        System.out.println("Gas");
        bmw.gas();
        System.out.println("Brake");
        bmw.brake();

    }
}
