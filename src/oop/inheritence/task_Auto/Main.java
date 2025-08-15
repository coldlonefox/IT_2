package oop.inheritence.task_Auto;

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){
        Lamborgine lamborgine = new Lamborgine();
        lamborgine.setName("Lamborghini");
        lamborgine.setAddress(122);
        lamborgine.setCountry("americano");
        lamborgine.setNumberCar(2343);

        lamborgine.setModel("Gallardo");
        lamborgine.setPrice(1200000L);
        lamborgine.setColour("Pink");
        lamborgine.setLocalDate(LocalDate.of(2023,2,3));
        System.out.println(lamborgine.toString());

    }
}
