package oop.tasks.encapsulation_task_lms;

import java.time.LocalDateTime;

public class School {
    private String nameSchool;
    private long howManyStudentsSchool;
    private double startTimeSchool;

    public School() {
    }
    public School(String nameSchool, long howManyStudentsSchool, double startTimeSchool) {
        this.nameSchool = nameSchool;
        this.howManyStudentsSchool = howManyStudentsSchool;
        this.startTimeSchool = startTimeSchool;
    }
    public String getNameSchool() {
        return nameSchool;
    }
    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }
    public long getHowManyStudentsSchool() {
        return howManyStudentsSchool;
    }
    public void setHowManyStudentsSchool(long howManyStudentsSchool) {
        this.howManyStudentsSchool = howManyStudentsSchool;
    }
    public double getStartTimeSchool() {
        return startTimeSchool;
    }
    public void setStartTimeSchool(double startTimeSchool) {
        this.startTimeSchool = startTimeSchool;
    }
    @Override
    public String toString() {
        return "~~~~~~~~~~~School~~~~~~" +
                "NameSchool: " + nameSchool + '\n' +
                "HowManyStudentsSchool: " + howManyStudentsSchool + '\n' +
                "StartTimeSchool: " + startTimeSchool + '\n' ;
    }
}
