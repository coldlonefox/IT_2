package Tasks.Lms.Java19_EducationCenter_Lms.Model;

import Tasks.Lms.Java19_EducationCenter_Lms.Abstract.EducationCenter;

import java.time.LocalDate;

public class University extends EducationCenter {
    public University() {
    }

    public University(String name, String locatedCountry, LocalDate localDate) {
        super(name, locatedCountry, localDate);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getLocatedCountry() {
        return super.getLocatedCountry();
    }

    @Override
    public void setLocatedCountry(String locatedCountry) {
        super.setLocatedCountry(locatedCountry);
    }

    @Override
    public LocalDate getLocalDate() {
        return super.getLocalDate();
    }

    @Override
    public void setLocalDate(LocalDate localDate) {
        super.setLocalDate(localDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
