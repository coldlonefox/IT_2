package oop.Enum.java19.models;

import oop.Enum.java19.Enums.Gander;
import oop.Enum.java19.Enums.Language;

import java.time.LocalDate;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate localDate;
    private Gander gander;
    private Language language;

    public Student() {
    }

    public Student(long id, String firstName, String lastName, LocalDate localDate, Gander gander, Language language) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.localDate = localDate;
        this.gander = gander;
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Gander getGander() {
        return gander;
    }

    public void setGander(Gander gander) {
        this.gander = gander;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", localDate=" + localDate +
                ", gander=" + gander +
                ", language=" + language +
                '}';
    }

}