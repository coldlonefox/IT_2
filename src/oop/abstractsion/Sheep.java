package oop.abstractsion;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age, String color, String breed) {
        super(name, age, color, breed);
    }

    @Override
    public void miss() {

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
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getBreed() {
        return super.getBreed();
    }

    @Override
    public void setBreed(String breed) {
        super.setBreed(breed);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
