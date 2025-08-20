package oop.abstractsion;

public abstract class Animal {
    private String name;
    private int age;
    private String color;
    private String breed;

    public Animal() {
    }

    public Animal(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "~~~~~~~~~~~~~Animal~~~~~~~~~" + '\n' +
                " Name = " + name + '\n' +
                " Age = " + age + '\n' +
                " Color = " + color + '\n' +
                " Breed = " + breed + '\n' ;
    }
}
