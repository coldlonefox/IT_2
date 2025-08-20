package oop.polymorphism.polymarphismPraktik.task_01;

public class Sheep extends Farm {
    private int weight;
    private int age;
    private String gender;
    private String nicrName;

    public Sheep() {
    }

    public Sheep(int weight, int age, String gender, String nicrName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nicrName = nicrName;
    }

    public Sheep(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses, int weight, int age, String gender, String nicrName) {
        super(address, ownerName, cows, sheep, horses);
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nicrName = nicrName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public String getNicrName() {
        return nicrName;
    }

    public void setNicrName(String nicrName) {
        this.nicrName = nicrName;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nicrName='" + nicrName + '\'' +
                '}';
    }
}
