package Tasks.Animal_lms;

public class Shark extends Animal {
    public static final String nameShark = "Shark";

    public Shark() {
    }

    public Shark(String name) {
        super(name);
    }

    public Shark(String name, String color, int age, String gender) {
        super(name, color, age, gender);
    }

    public static void attack () {
       System.out.println("Shark attack");
   }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString() ;

    }
}
