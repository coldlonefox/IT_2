package oop.tasks.CRUD.task1_house;

public class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public House(){}
    public House(String address,int numberOfRooms,double area){
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return  "House: " + '\n'+
                "address: " + address + '\n' +
                "numberOfRooms: " + numberOfRooms +'\n'+
                "area: " + area;
    }
    public double calculator(int price){
        return area * price;
    }
}
