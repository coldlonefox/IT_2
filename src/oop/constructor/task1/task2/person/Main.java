package oop.constructor.task1.task2.person;

public class Main {
    public static void main(String[] args) {
        Person person =new Person();
        Person person1 = new Person("Aibek",20L,"IT",230000L,9L);
        Person person2 = new Person("Almaz",23L,"Master",13000L,6L);
        Person person3 = new Person("Daminik",38L,"Texnik",90000L,7L);
        Person person4 = new Person("Alisher",11L,"Menedjr",80000L,6L);
        Person person5 = new Person("Adilet",19L,"Svarshik",73000L,5L);
        Person[] people = {person1,person2,person3,person4,person5};
        for (int i = 0; i < people.length; i++) {
            people[i].getInfoPerson();
        }
        Person maxs = people[0];
        Person mins = people[0];
        for (Person person6 : people){
            if (person6.salary > maxs.salary) {
                maxs.salary = person6.salary;
            }
            if (person6.salary < mins.salary) {
                mins.salary = person6.salary;
            }
        }
        System.out.println("----- max  salary-----");
        System.out.println(maxs.salary);
        maxs.getInfoPerson();
        System.out.println("----- min salary------");
        mins.getInfoPerson();
        System.out.println("----- phone price------ ");
        maxs.getInfoPerson();


    }
}