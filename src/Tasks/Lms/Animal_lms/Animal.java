package Tasks.Lms.Animal_lms;

public class Animal {
    private String name;
    private String color;
    private int age;
    private String gender;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String color, int age, String gender) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void animal () {
        System.out.println(" ? ");
    }

    @Override
    public String toString() {
        return  " Name: " + name + "     Color: " + color + "     Age: " + age + "     Gender: " + gender ;
    }
}
