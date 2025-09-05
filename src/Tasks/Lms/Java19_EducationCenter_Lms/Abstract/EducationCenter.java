package Tasks.Lms.Java19_EducationCenter_Lms.Abstract;

import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String  locatedCountry;
    private LocalDate localDate;

    public EducationCenter() {
    }

    public EducationCenter(String name, String locatedCountry, LocalDate localDate) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.localDate = localDate;
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

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "EducationCenter\n" +
                "Name : " + name + '\n' +
                "LocatedCountry : " + locatedCountry + '\n' +
                "LocalDate : " + localDate;
    }
}
