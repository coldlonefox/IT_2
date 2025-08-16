package oop.tasks.Inheritance_task_lms;

public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }
    public Programmer(String companyName) {
        this.companyName = companyName;
    }
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding () {}

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
    public Programmer(String name, String designation) {
        super(name, designation);
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
        return "\n~~~~~~~~~~Programmer~~~~~~~~~~" + '\n' +
                super.toString() + '\n' +
                "CompanyName: " + companyName + '\n';


    }
}
