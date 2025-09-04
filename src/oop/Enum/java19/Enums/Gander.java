package oop.Enum.java19.Enums;

public enum Gander {

    FEMALE(),
    MALE();

    private String country;

    Gander(){
    }
    Gander(String country){
        this.country = country;
    }

}
