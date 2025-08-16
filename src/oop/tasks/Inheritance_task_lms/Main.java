package oop.tasks.Inheritance_task_lms;

public class Main {
    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        Programmer programmer = new Programmer("Аноним","Programmer","PeakSoft");
        Dancer dancer1 = new Dancer();
        Dancer dancer = new Dancer("Айсулу Асанбековна","Daces","Мой мир");
        Singer singer1 = new Singer();
        Singer singer = new Singer("Aleksandr Rybak","Music","Класика");

        System.out.println(programmer);
        System.out.println(dancer);
        System.out.println(singer);


    }
}
