package oop.tasks.Inheritance_task_lms;

public class Dancer extends Person {
    private String groupName;

    public Dancer() {
    }
    public Dancer(String groupName) {
        this.groupName = groupName;
    }
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing () {}

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
        return "\n~~~~~~~~~~Dancer~~~~~~~~~~" + '\n' +
                super.toString() + "\n" +
                "GroupName: " + groupName + '\n' ;
    }
}
