package oop.constructor.task1.task2.person;

public class Person {
    String name;
    Long age;
    String work;
    Long salary;
    Long phone;
    public Person (){}
    public Person (String name,Long age,String work, Long salary,Long phone){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }
    public void getInfoPerson (){
        System.out.println("name: "+name+"\n" +
                "age: " +age+"\n"+
                "work: " +work+"\n"+
                "salary: " +salary+"\n"+
                "phone: " +phone+"\n");
    }
    public void getInfoPerson1(Long... people){
        for (Long number1 : people){
            Long number2 = people[0];
            if (salary > number2) {
                number2 = salary;

            } else {
                System.out.println(
                        "\nsalary: " +number2+"\n");
            }
            System.out.println(
                    "\nsalary: " +number2+"\n");
        }


    }
}
