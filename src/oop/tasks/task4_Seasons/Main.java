package oop.tasks.task4_Seasons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n    1-ден 12-ге чейин сан бериниз!");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number: ");
            new Seasons().object(scanner.nextInt());
        }
    }
}