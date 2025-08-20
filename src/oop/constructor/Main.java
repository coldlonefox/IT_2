package oop.constructor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student0 = new Student("Abduvali",LocalDate.of(2002,2,3),220709183L,"KGZ");
        Student student1 = new Student("Alihan",LocalDate.of(2009,2,3),22007012183L,"KGZ");
        Student student2 = new Student("Alisher",LocalDate.of(2000,2,3),212332183L,"KGZ");
        Student student3 = new Student("Abdurrahman", LocalDate.of(2007,2,3),222443L,"KGZ");
        Student student4 = new Student("Aibek", LocalDate.of(2012,2,3),220324383L,"KGZ");

        Student[] students = {student0,student1,student2,student3,student4};
        for (int i = 0; i < students.length; i++) {
            students[i].getInfoStudent();
        }
    }
}