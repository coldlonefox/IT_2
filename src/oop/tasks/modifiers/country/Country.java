package oop.tasks.modifiers.country;

public class Country {
    private long id;
    private String name;
    private long square;
    private long population;
    private String language;

    public Country() {
    }

    public Country(long id, String name, long square, long population, String language) {
        this.id = id;
        this.name = name;
        this.square = square;
        this.population = population;
        this.language = language;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSquare() {
        return square;
    }

    public void setSquare(long square) {
        this.square = square;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static void byIDCountry (Country ... countries) {
        for (Country country : countries){

        }
    }
}
