package oop.inheritence.task_Auto;

public class Auto {
    private String name;
    private long address;
    private String country;
    private long numberCar;

    public Auto() {
    }

    public Auto(String name, long address, String country, long numberCar) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.numberCar = numberCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAddress() {
        return address;
    }

    public void setAddress(long address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(long numberCar) {
        this.numberCar = numberCar;
    }

    @Override
    public String toString() {
        return "\nName: " + name + '\n' +
                "Address: " + address + '\n' +
                "Country: " + country + '\n' +
                "NumberCar: " + numberCar;
    }
}
