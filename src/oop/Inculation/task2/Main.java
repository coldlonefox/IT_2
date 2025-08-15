package oop.Inculation.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Student student = new Student();
        student.setName(scanner.nextLine());
        student.setLast(scanner.nextLine());
        student.setAge(scanner1.nextLong());
        student.setCourses(scanner.nextLine());

    }
}