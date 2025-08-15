package oop.inheritence.task_Animals;

public class Main {
    public static void main (String [] args){

        Sheep sheep = new Sheep();
        sheep.setName("Кашка");
        sheep.setGander("M");
        sheep.setAge(2);

        Tiger tiger = new Tiger();
        tiger.setName("Sherxan");
        tiger.setGander("M");
        tiger.setAge(4);

        System.out.println("~~~~~~Sheep~~~~~~"+"\nName: "+sheep.getName()+"\n"+
                "Gender: "+sheep.getGander()+"\n"+
                "Age: "+sheep.getAge());
        System.out.println("~~~~~~Tiger~~~~~~"+"\nName: "+tiger.getName()+"\n"+
                "Gender: "+tiger.getGander()+"\n"+
                "Age: "+tiger.getAge());
        Animals animals = new Animals();


        System.out.println("\n\n\n"+animals.toString());

    }
}
