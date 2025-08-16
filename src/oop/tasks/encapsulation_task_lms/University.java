package oop.tasks.encapsulation_task_lms;

public class University {
    private String nameUniversity;
    private long yearOfOpeningUniversity;
    private String embroiderEducation;

    public University() {
    }
    public University(String nameUniversity, long yearOfOpeningUniversity, String embroiderEducation) {
        this.nameUniversity = nameUniversity;
        this.yearOfOpeningUniversity = yearOfOpeningUniversity;
        this.embroiderEducation = embroiderEducation;
    }
    public String getNameUniversity() {
        return nameUniversity;
    }
    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }
    public long getYearOfOpeningUniversity() {
        return yearOfOpeningUniversity;
    }
    public void setYearOfOpeningUniversity(long yearOfOpeningUniversity) {
        this.yearOfOpeningUniversity = yearOfOpeningUniversity;
    }
    public String getEmbroiderEducation() {
        return embroiderEducation;
    }
    public void setEmbroiderEducation(String embroiderEducation) {
        this.embroiderEducation = embroiderEducation;
    }
    @Override
    public String toString() {
        return "~~~~~~~~University~~~~~~~" +
                "NameUniversity: " + nameUniversity + '\n' +
                "YearOfOpeningUniversity: " + yearOfOpeningUniversity + "\n" +
                "EmbroiderEducation: " + embroiderEducation + '\n' ;
    }
}
