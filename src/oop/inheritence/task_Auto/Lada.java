package oop.inheritence.task_Auto;

import java.time.LocalDate;

public class Lada extends Auto{
    private String model;
    private long price;
    private String colour;
    private LocalDate localDate;

    public Lada(String model, long price, String colour, LocalDate localDate) {
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.localDate = localDate;
    }

    public Lada(String name, long address, String country, long numberCar, String model, long price, String colour, LocalDate localDate) {
        super(name, address, country, numberCar);
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.localDate = localDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return  "Model: " + model + '\n' +
                "Price: " + price + '\n' +
                "Colour: " + colour + '\n' +
                "LocalDate: " + localDate ;
    }
}
