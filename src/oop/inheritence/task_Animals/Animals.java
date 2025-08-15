package oop.inheritence.task_Animals;

public class Animals {
    private String name;
    private String gander;
    private int age;

    public Animals() {    }
    public Animals(String name, String gander, int age) {
        this.name = name;
        this.gander = gander;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGander() {
        return gander;
    }
    public void setGander(String gander) {
        this.gander = gander;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "name: " + name + '\n' +
                "gander: " + gander + '\n' +
                "age: " + age + '\n';
    }
}
