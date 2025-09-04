package oop.abstractsion.abstractsion_praktik.task_01;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private String gander;
    private LocalDate localDate;
    private EducationCenter educationCenter= new EducationCenter() {
        @Override
        public void setName(String name) {
            super.setName(name);
        }

        @Override
        public void setLocatedCountry(String locatedCountry) {
            super.setLocatedCountry(locatedCountry);
        }

        @Override
        public void setFoundAtionDate(long foundAtionDate) {
            super.setFoundAtionDate(foundAtionDate);
        }
    };

    public Student() {
    }

    public Student(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    public Student(String name, String surName, String gander, LocalDate localDate) {
        this.name = name;
        this.surName = surName;
        this.gander = gander;
        this.localDate = localDate;
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

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gander='" + gander + '\'' +
                ", localDate=" + localDate +
                ", educationCenter=" + educationCenter +
                '}';
    }
}
