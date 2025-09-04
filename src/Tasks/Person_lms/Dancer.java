package Tasks.Person_lms;

public class Dancer extends Person{
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

    @Override
    public String toString() {
        return   " "+super.toString() + '\n' +
                 "Group name: " + groupName + '\n';
    }

    @Override
    public void learn() {
        System.out.println("i teach kids dancing .");
    }

    @Override
    public void walk() {
        System.out.println("i am going to dancing .");
    }

    @Override
    public void eat() {
        System.out.println("i eat is are bread .");
    }
    public void dancing(){
        System.out.println("i am dancer! ");
    }
}
