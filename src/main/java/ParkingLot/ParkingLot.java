package ParkingLot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by twer on 5/21/15.
 */
public class ParkingLot {
    private final int _capacity;
    Map<CarParkingToken, Car> _cars = new HashMap<CarParkingToken, Car>();

    public ParkingLot(int capacity) {
        _capacity = capacity;
    }

    public CarParkingToken park(Car car) {
        if(_capacity <= _cars.size())
            return null;

        CarParkingToken token = new CarParkingToken();
        _cars.put(token, car);
        return token;
    }

    public Car unPark(CarParkingToken token) {
        return _cars.get(token);
    }
}
