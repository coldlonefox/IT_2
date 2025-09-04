package oop.Enum.java19.Enums;

public enum Language {
    KGZ(),
    RU(),
    KZ();

    private String country;

    Language(){}
    Language(String country){
        this.country = country;
    }
}
