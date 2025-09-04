package oop.exception.exceptionPrakrik.enums;

public enum Gander {
    MALE("MALE"),
    FEMALE("FEMALE");

    Gander() {
    }
    private String country;

    Gander(String country) {
        this.country = country;
    }
}
