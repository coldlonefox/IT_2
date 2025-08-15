package oop.Inculation.task2;

public class Student {
    private String name;
    private String last;
    private Long age;
    private String[] courses;

    public Student () {    }
    public Student (String name, String last,Long age, String...courses) {this.name = name;this.last = last;this.age = age;this.courses = courses;}

    public String getName() {return name;}
    public String getLast() {return last;}
    public Long getAge() {return age;}
    public String[] getCourses() {return courses;}

    public void setName(String name){this.name = name;}
    public void setLast(String last){this.last = last;}
    public void setAge(Long age){this.age = age;}
    public void setCourses(String...courses){this.courses = courses;}

    public void getInfoStudent (){

    }
}
