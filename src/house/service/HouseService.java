package house.service;

import house.model.House;
import house.model.HouseType;

public interface HouseService {
    String CreateHouse (House house);
    House[] getHouseByHouseType (HouseType houseType);
//    House getHouseById (Long id);
//    String updateHouseGetById(Long id, House house);
//    String DeleteHouseGetById(Long id);
}
