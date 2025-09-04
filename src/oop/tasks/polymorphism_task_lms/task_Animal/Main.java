package oop.tasks.polymorphism_task_lms.task_Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerStringType = new Scanner(System.in);
        Scanner scannerIntType = new Scanner(System.in);

        Animal[] animals = {
                new Shark(Shark.nameShark),
                new Shark(Shark.nameShark),
                new Shark(Shark.nameShark),
                new Turtle(Turtle.nameTurtle),
                new Turtle(Turtle.nameTurtle),
                new Turtle(Turtle.nameTurtle),
                new Eagle(Eagle.nameEagle),
                new Eagle(Eagle.nameEagle),
                new Eagle(Eagle.nameEagle),
        };

        for (Animal animal : animals){
            if (animal.getName().equalsIgnoreCase(Shark.nameShark)){
                System.out.println("~~~~~Shark~~~~~");
                System.out.print("Colour: ");
                animal.setColor(scannerStringType.nextLine());
                System.out.print("Age: ");
                animal.setAge(scannerIntType.nextInt());
                System.out.print("Gender: ");
                animal.setGender(scannerStringType.nextLine());
                Shark.attack();
            } else if (animal.getName().equalsIgnoreCase(Turtle.nameTurtle)) {
                System.out.println("~~~~~Turtle~~~~~");
                System.out.print("Colour: ");
                animal.setColor(scannerStringType.nextLine());
                System.out.print("Age: ");
                animal.setAge(scannerIntType.nextInt());
                System.out.print("Gender: ");
                animal.setGender(scannerStringType.nextLine());
                Turtle.swim();
            }else if (animal.getName().equalsIgnoreCase(Eagle.nameEagle)) {
                System.out.println("~~~~~Eagle~~~~~");
                System.out.print("Colour: ");
                animal.setColor(scannerStringType.nextLine());
                System.out.print("Age: ");
                animal.setAge(scannerIntType.nextInt());
                System.out.print("Gender: ");
                animal.setGender(scannerStringType.nextLine());
            }
        }

        System.out.println("~~~~~Shark attack~~~~~");
        Shark.attack();
        System.out.println("~~~~~Turtle swim~~~~~");
        Turtle.swim();
        System.out.println("~~~~~Eagle fly~~~~~");
        Eagle.fly();

        Animal [] sharks = new Shark[3];
        Animal [] turtles = new Turtle[3];
        Animal [] eagles = new Eagle[3];
        int number = 0;
        for (Animal animal : animals){
            if (animal.getName().equals(Shark.nameShark)){
                sharks[number++] = animal;
            } else if (animal.getName().equals(Turtle.nameTurtle)) {
                turtles[number++] = animal;
            } else if (animal.getName().equals(Eagle.nameEagle)) {
                eagles[number++] = animal;
            }
        }

        System.out.print("\nSearch by color : ");
        String color = scannerStringType.nextLine();
        for (Animal animal : animals){
            if (animal.getColor().equalsIgnoreCase(color)){
                System.out.println(animal);
            }
        }
        System.out.print("\nSearch by gender : ");
        String gender = scannerStringType.nextLine();
        for (Animal animal : animals) {
            if (animal.getGender().contains(gender)){
                System.out.println(animal);

            }
        }
        System.out.print("\nSearch by age : ");
        int age = scannerIntType.nextInt();
        for (Animal animal : animals) {
            if (animal.getAge() == age){
                System.out.println(animal);
            }
        }


    }
}
