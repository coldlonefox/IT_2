package oop.tasks.Inheritance_task_lms;

public class Singer extends Person {
    private String bandName;

    public Singer() {
    }
    public Singer(String bandName) {
        this.bandName = bandName;
    }
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing () {}
    public void playGitar () {}

    @Override
    public void learn() {
        super.learn();
    }
    @Override
    public void walk() {
        super.walk();
    }
    @Override
    public void eat() {
        super.eat();
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
    public String getDesignation() {
        return super.getDesignation();
    }
    @Override
    public void setDesignation(String designation) {
        super.setDesignation(designation);
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~Singer~~~~~~~~~~" + '\n' +
                super.toString() + '\n' +
                "BandName: " + bandName + '\n' ;
    }
}
