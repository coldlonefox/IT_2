package oop.tasks.encapsulation_task_lms;

public class Person {
    private String namePerson;
    private String lastNamePerson;
    private int agePerson;

    public Person() {
    }
    public Person(String namePerson, String lastNamePerson, int agePerson) {
        this.namePerson = namePerson;
        this.lastNamePerson = lastNamePerson;
        this.agePerson = agePerson;
    }
    public String getNamePerson() {
        return namePerson;
    }
    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
    public String getLastNamePerson() {
        return lastNamePerson;
    }
    public void setLastNamePerson(String lastNamePerson) {
        this.lastNamePerson = lastNamePerson;
    }
    public int getAgePerson() {
        return agePerson;
    }
    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }
    @Override
    public String toString() {
        return "~~~~~~~~~Person~~~~~~~" + '\n' +
                "NamePerson: " + namePerson + '\n' +
                "LastNamePerson: " + lastNamePerson + '\n' +
                "AgePerson: " + agePerson ;
    }
}
