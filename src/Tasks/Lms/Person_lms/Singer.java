package Tasks.Lms.Person_lms;

public class Singer extends Person{
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

    @Override
    public String toString() {
        return  " "+super.toString() + '\n' +
                "Band name:" + bandName + '\n';
    }

    @Override
    public void learn() {
        System.out.println("I teach children to sing, and what mistakes should not be made, and I like to teach children .");
    }

    @Override
    public void walk() {
        System.out.println("When I go to sleep, I like to listen to music, I like to sing myself.");
    }

    @Override
    public void eat() {
        System.out.println("My mom cooks the best dishes for me and I like how mom cooks. I love you, mom and dad, I love everyone.");
    }

    public void singing(){
        System.out.println("May's family likes singing .");
    }

    public void playGuitar(){
        System.out.println("I play guitar at night .");
    }
}
