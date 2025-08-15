package oop.homework.taskHome;

import java.util.Random;

public class Main {
    public static void main () {
        Home home1 = new Home("My Home");
        Home home2 = new Home();
        home2.setName("My home is not small!");

        Random random = new Random();
        Home home3 = new Home();
        for (int i = 0; i < 34; i++) {
            home3.setaFloor(random.nextInt());
        }

        Home home4 = new Home();

    }
}
