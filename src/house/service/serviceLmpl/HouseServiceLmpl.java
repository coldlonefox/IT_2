package house.service.serviceLmpl;

import house.model.House;
import house.model.HouseType;
import house.service.HouseService;

public class HouseServiceLmpl implements HouseService {

    House[] houses = new House[12];
    int index = 0;

    @Override
    public String CreateHouse(House house) {
        try{
            houses[index++] = house;
            System.out.println(house);
            System.out.println("successFully");
            throw new RuntimeException("successFully");

        } catch (RuntimeException e) {
           return "Error : " + e;
        }

    }

    @Override
    public House[] getHouseByHouseType(HouseType houseType) {
        try{
            System.out.println("~~~~~House~~~~~~~");
            return houses;
        } catch (Exception e) {
            throw new RuntimeException("Error : "+e);
        }
    }

}
