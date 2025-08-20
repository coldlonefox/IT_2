package oop.polymorphism.polymarphismPraktik.task_01;

public class Main {
    public static void main(String[] args) {

        Cow[] cows =new Cow[] {
                new Cow(500,3,"M","Murka"),
                new Cow(500,3,"M","Murka"),
                new Cow(500,3,"M","Murka"),
                new Cow(500,3,"M","Murka"),
                new Cow(500,3,"M","Murka")
        };
        Sheep[] sheep1 = {
                new Sheep(40,2,"M","Mishka"),
                new Sheep(40,2,"M","Mishka"),
                new Sheep(40,2,"M","Mishka")
        };
        Horse[] horses = {
                new Horse(500,5,"Kara-ala","M","kar-Ala"),
                new Horse(500,5,"Kara-ala","M","kar-Ala"),
                new Horse(500,5,"Kara-ala","M","kar-Ala")
        };
        Farm farm = new Farm("taktogul","",cows,sheep1,horses);


    }
}
