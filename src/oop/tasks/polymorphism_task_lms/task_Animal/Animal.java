package oop.tasks.polymorphism_task_lms.task_Animal;

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

    public Animal(String color, int age, String gender) {
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
        return "~~~~~~~~Animal~~~~~~~~" + '\n' +
                "Name: " + name + '\n' +
                "Color: " + color + '\n' +
                "Age: " + age + '\n' +
                "Gender: " + gender + '\n';
    }
}
