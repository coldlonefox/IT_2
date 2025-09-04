package oop.abstractsion.abstractsion_praktik.task_01;

import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String locatedCountry;
    private long  foundAtionDate;

    public EducationCenter() {
    }

    public EducationCenter(String name, String locatedCountry, long foundAtionDate) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundAtionDate = foundAtionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public long getFoundAtionDate() {
        return foundAtionDate;
    }

    public void setFoundAtionDate(long foundAtionDate) {
        this.foundAtionDate = foundAtionDate;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", foundAtionDate=" + foundAtionDate +
                '}';
    }
}
