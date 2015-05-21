import ParkingLot.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by twer on 5/21/15.
 */
public class ParkingLotTest {
    @Test
    public void should_park_car_when_parkinglot_has_empty_parking_space()
    {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        assertNotEquals(parkingLot.park(car), null);
    }

    @Test
    public void should_not_park_car_when_parkinglot_has_no_parking_space()
    {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car1 = new Car();
        Car car2 = new Car();

        assertNotEquals(parkingLot.park(car1), null);
        assertEquals(parkingLot.park(car2), null);
    }

    @Test
    public void should_unpark_car_when_the_car_is_in_the_parkinglot()
    {
        ParkingLot parkingLot = new ParkingLot(1);
        Car car = new Car();
        CarParkingToken token = parkingLot.park(car);

        assertEquals(car, parkingLot.unPark(token));
    }

    @Test
    public void should_not_unpark_car_when_the_car_is_not_in_the_parkinglot()
    {
        ParkingLot parkingLot = new ParkingLot(1);

        assertEquals(null, parkingLot.unPark(null));
    }
}
