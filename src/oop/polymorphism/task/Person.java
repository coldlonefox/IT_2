package oop.polymorphism.task;

public class Person {
    private String name;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk () {
        System.out.println("some walk");
    }

    @Override
    public String toString() {
        return "Person { " +
                "Name = " + name + '\'' +
                " } ";
    }
}
