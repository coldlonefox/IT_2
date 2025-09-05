package house;

import house.model.House;
import house.model.HouseType;
import house.service.serviceLmpl.HouseServiceLmpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HouseType house1 = new HouseType();

            House house4 = new House(1L, "Bishkek", 12, 62000f, LocalDate.of(2025, 5, 25));

            HouseServiceLmpl houseServiceLmpl = new HouseServiceLmpl();
            houseServiceLmpl.CreateHouse(house4);

            houseServiceLmpl.getHouseByHouseType(house1);


    }
}
