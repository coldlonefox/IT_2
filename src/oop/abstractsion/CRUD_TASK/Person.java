package oop.abstractsion.CRUD_TASK;

import java.time.LocalDate;
import java.util.Arrays;

public class Person {
    private long id;
    private String name;
    private String email;
    private LocalDate localDate;
    private String phoneNumber;

    public Person() {
    }

    public Person(long id, String name, String email, LocalDate localDate, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.localDate = localDate;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "~~~~~~~Person~~~~~~~" + '\n' +
                "Name: " + name + '\n' +
                "Email: " + email + '\n' +
                "LocalDate: " + localDate +
                "PhoneNumber: " + phoneNumber + '\n';
    }

    private Person[] people2;


    private Person[] people = new Person[10];
    int index = 0;


    // todo ~~~~~~~~Create~~~~~~~~
    public void createPerson(Person person){
//        // todo 1
//        people[index++] = person;
//        System.out.println("Успешно.");
        // todo 2
        people = Arrays.copyOf(people,people.length + 1);
        people[people.length - 1] = person;
    }


    // todo ~~~~~~~~GET ALL~~~~~~~~
    public Person[] getAll () {
        return people;
    }

    // todo ~~~~~~~~GET BY ID~~~~~~~~
    public Person getByID (long id) {
        for (Person person : people){
            if (person.getId() == id){
                return person;
            }else {
                System.out.println("not fount"+ id);
            }
        }
        return null;
    }

    // todo ~~~~~~~~Update~~~~~~~~
    public void updateByIDPerson (long id,Person newPerson) {
        for (Person person : people){
            if (person.getId() == id){
                person.setName(newPerson.getName());
                person.setEmail(newPerson.getEmail());
                person.setLocalDate(newPerson.getLocalDate());
                person.setPhoneNumber(newPerson.getPhoneNumber());
                break;
            }else {

                System.out.println("not fount"+ id);
            }
        }
    }

    // todo ~~~~~~~~Delete BY ID~~~~~~~~
    public void deleteByIDPerson() {

    }

}
