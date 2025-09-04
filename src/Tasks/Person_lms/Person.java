package Tasks.Person_lms;

public class Person {
    private String name;
    private String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "Designation: " + designation + '\n';
    }

    public void learn () {
        System.out.println("teach whom .");
    }
    public void walk () {
        System.out.println("Go where .");
    }
    public void eat () {
        System.out.println("what kind of food is there .");
    }

}
