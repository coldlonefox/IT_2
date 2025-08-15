package oop.constructor.task1;

import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateOfBirth;
    Long phoneNumber;
    String nationality;
    public Student ( ){    }
    public Student (String name,LocalDate dateOfBirth,Long phoneNumber,String nationality){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }
    public void getInfoStudent (){
        System.out.println("\nname: "+name+"\n" +
                "date_of_birth: " +dateOfBirth+"\n" +
                "phoneNumber: " +phoneNumber+"\n" +
                "nationality: " +nationality+"\n"+
                "Studentтин жашы: " +(2025 - dateOfBirth.getYear())+"\n"
        );

    }

}
