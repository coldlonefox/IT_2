package oop.tasks.encapsulation_task_lms;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

    //todo ~~~~~~~~~~~~Person~~~~~~~~~~~~
        Person person1 = new Person();
        person1.setNamePerson("Абдували");
        person1.setLastNamePerson("Бакытбеков");
        person1.setAgePerson(18);

        Person person2 = new Person();
        person2.setNamePerson("Сыймык");
        person2.setLastNamePerson("Курманбек уулу");
        person2.setAgePerson(19);

        Person person3 = new Person();
        person3.setNamePerson("Жакшылык");
        person3.setLastNamePerson("Бакытбек уулу");
        person3.setAgePerson(19);

        Person[] people = {person1,person2,person3};
        System.out.println("~~~~~~~~~~~~Person~~~~~~~~~~~~");
        for (Person person : people){
            System.out.println("NamePerson: "+person.getNamePerson()+"\n"+
                               "LastNamePerson: "+person.getLastNamePerson()+"\n"+
                               "AgePerson: "+person.getAgePerson()+"\n");
        }

    //todo ~~~~~~~~~~~~University~~~~~~~~~~~~
        University university1 = new University();
        university1.setNameUniversity("И.Арабаева");
        university1.setYearOfOpeningUniversity(1945);
        university1.setEmbroiderEducation("Специализирующий сферы оброзования и культуре");

        University university2 = new University();
        university2.setNameUniversity("Жусуп Баласагын");
        university2.setYearOfOpeningUniversity(1925);
        university2.setEmbroiderEducation("Вышей оброзование, Старейший и Крупнейший");

        University university3 = new University();
        university3.setNameUniversity("Манас");
        university3.setYearOfOpeningUniversity(1995);
        university3.setEmbroiderEducation("Англизкий оброзование");

        University[] universities = {university1, university2, university3};
        System.out.println("\n~~~~~~~~~~~~University~~~~~~~~~~~~\n");
        for (University university : universities){
            System.out.println("NameUniversity: "+university.getNameUniversity()+"\n"+
                               "YearOfOpeningUniversity: "+university.getYearOfOpeningUniversity()+"\n"+
                               "EmbroiderEducation: "+university.getEmbroiderEducation()+"\n");
        }

    //todo ~~~~~~~~~~~~School~~~~~~~~~~~~
        School school1 = new School();
        school1.setNameSchool("Нурманбет");
        school1.setHowManyStudentsSchool(500L);
        school1.setStartTimeSchool(7.00);

        School school2 = new School();
        school2.setNameSchool("Мойдунов");
        school2.setHowManyStudentsSchool(900L);
        school2.setStartTimeSchool(8.00);

        School school3 = new School();
        school3.setNameSchool("Финал");
        school3.setHowManyStudentsSchool(600L);
        school3.setStartTimeSchool(8.00);

        School[] schools = {school1, school2, school3};
        System.out.println("\n~~~~~~~~~~~~School~~~~~~~~~~~~\n");
        for (School school : schools){
            System.out.println("NameSchool: "+school.getNameSchool()+"\n"+
                               "HowManyStudentsSchool: "+school.getHowManyStudentsSchool()+"\n"+
                               "StartTimeSchool: "+school.getStartTimeSchool()+"\n");
        }

    //todo ~~~~~~~~~~~~Car~~~~~~~~~~~~
        Car car1 = new Car();
        car1.setNameCar("LADA");
        car1.setModelCar("NIVA");
        car1.setPowerCar(300);

        Car car2 = new Car();
        car2.setNameCar("TOYOTA or TOTOYA");
        car2.setModelCar("Camry");
        car2.setPowerCar(400);

        Car car3 = new Car();
        car3.setNameCar("BMW");
        car3.setModelCar("M5");
        car3.setPowerCar(500);

        Car[] cars = {car1, car2, car3};
        System.out.println("\n~~~~~~~~~~~~Car~~~~~~~~~~~~\n");
        for (Car car : cars){
            System.out.println("NameCar: "+car.getNameCar()+"\n"+
                               "ModelCar: "+car.getModelCar()+"\n"+
                               "PowerCar: "+car.getPowerCar()+"\n");
        }


    }
}
