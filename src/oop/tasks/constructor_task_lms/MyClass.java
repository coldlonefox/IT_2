package oop.tasks.constructor_task_lms;

import java.util.Arrays;

public class MyClass {
    String name;
    String lastName;
    int age;
    String food;
    String[] themes;

    public MyClass() {
    }

    public MyClass(String name, String lastName, int age, String food, String...themes) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.food = food;
        this.themes = themes;
    }

    @Override
    public String toString() {
        return  "\nName      :  " + name + '\n' +
                "LastName  :  " + lastName + '\n' +
                "Age       :  " + age +'\n' +
                "Themes    :  " + Arrays.toString(themes) +'\n' +
                "Food      :  " + food + '\n' ;
    }
}
