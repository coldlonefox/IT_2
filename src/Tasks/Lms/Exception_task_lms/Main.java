package Tasks.Lms.Exception_task_lms;

import Tasks.Lms.Exception_task_lms.models.Cylinder.Cylinder;
import Tasks.Lms.Exception_task_lms.models.Parallelepiped.Parallelepiped;
import Tasks.Lms.Exception_task_lms.service.Model;
import Tasks.Lms.Exception_task_lms.service.serviceImpl.ModelImpl;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            try{
                Parallelepiped parallelepiped = new Parallelepiped();
                Cylinder cylinder = new Cylinder();
                Scanner scanner = new Scanner(System.in);
                System.out.print(" Параллелепипед 1-номерде .\n Цилиндр 2-номерде .\nНомер бериниз : ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1 -> {
                        System.out.println("~~~~~~~~~~Parallelepiped~~~~~~~~~~");
                        System.out.print("длина : ");
                        number = scanner.nextInt();
                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            parallelepiped.setLength(number);
                        }
                        System.out.print("ширина : ");
                        number = scanner.nextInt();
                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            parallelepiped.setWidth(number);
                        }
                        System.out.print("высота : ");
                        number = scanner.nextInt();
                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            parallelepiped.setHeight(number);
                        }
                        System.out.print("радиус : ");
                        number = scanner.nextInt();
                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            parallelepiped.setRadius(number);
                        }
                        Model model = new ModelImpl();
                        model.getByParallelepiped(parallelepiped);
                        if (false) {
                        } else {
                            System.out.println("Выход\n");
                        }
                    }
                    case 2 -> {
                        System.out.println("~~~~~~~~~~Cylinder~~~~~~~~~~");
                        System.out.print("длина : ");
                        number = scanner.nextInt();

                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            cylinder.setLength(number);
                        }
                        System.out.print("ширина : ");
                        number = scanner.nextInt();
                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            cylinder.setWidth(number);
                        }
                        System.out.print("высота : ");
                        number = scanner.nextInt();
                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            cylinder.setHeight(number);
                        }
                        System.out.print("радиус : ");
                        number = scanner.nextInt();
                        if (number < 0) {
                            throw new RuntimeException("Сиз терс сан бердиниз! \n ERROR: " + number);
                        } else {
                            cylinder.setRadius(number);
                        }
                        Model model = new ModelImpl();
                        model.getByCylinder(cylinder);
                        if (false) {
                        } else {
                            System.out.println("Выход\n");
                        }
                    }default ->  System.out.println(" Сиз берген сан жок! ");
                }
            }catch (Exception e){
                System.out.println("Error : "+e);
            }
        }
    }
}
