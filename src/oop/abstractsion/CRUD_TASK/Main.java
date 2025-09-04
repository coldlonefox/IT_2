package oop.abstractsion.CRUD_TASK;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Person person1 = new Person(1L,"Alihan","alihan@email.com", LocalDate.of(2003,4,1),"+99670434534");
        Person person2 = new Person(2L,"Aibek","Aibek@email.com", LocalDate.of(2003,4,1),"+99670434534");
        Person person3 = new Person(3L,"Nurbolot","Nurbolot@email.com", LocalDate.of(2003,4,1),"+99670434534");


    }
}
