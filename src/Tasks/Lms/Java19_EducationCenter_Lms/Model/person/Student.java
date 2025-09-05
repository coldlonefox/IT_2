package Tasks.Lms.Java19_EducationCenter_Lms.Model.person;

import Tasks.Lms.Java19_EducationCenter_Lms.Abstract.EducationCenter;
import Tasks.Lms.Java19_EducationCenter_Lms.Enum.Gander;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private Gander gander;
    private LocalDate localDate;
    private EducationCenter educationCenter;

    public Student() {
    }

    public Student(String name, String surName, Gander gander, LocalDate localDate, EducationCenter educationCenter) {
        this.name = name;
        this.surName = surName;
        this.gander = gander;
        this.localDate = localDate;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Gander getGander() {
        return gander;
    }

    public void setGanger(Gander gander) {
        this.gander = gander;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~Student~~~~~~~\n" +
                "Name : " + name + "\n" +
                "SurName : " + surName + "\n" +
                "Gander : " + gander + "\n" +
                "LocalDate : " + localDate + "\n" +
                "EducationCenter : " + educationCenter +'\n';
    }
}
