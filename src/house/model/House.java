package house.model;

import java.time.LocalDate;

public class House{
    private Long id;
    private String address;
    private int room;
    private double price;
//    private HouseType houseType;
    private LocalDate localDate;

    public House() {
    }

    public House(Long id, String address, int room, double price/* HouseType houseType*/, LocalDate localDate) {
        this.id = id;
        this.address = address;
        this.room = room;
        this.price = price;
//        this.houseType = houseType;
        this.localDate = localDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//
//    public HouseType getHouseType() {
//        return houseType;
//    }
//
//    public void setHouseType(HouseType houseType) {
//        this.houseType = houseType;
//    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return  "House" + "\n" +
                "Id : " + id + '\n' +
                "Address : " + address + '\n' +
                "Room : " + room + '\n' +
                "Rice : " + price + '\n' +
//                "HouseType : " + houseType + '\n' +
                "LocalDate : " + localDate + '\n';
    }
}
