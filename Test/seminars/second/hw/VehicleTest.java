package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("BMW", "M5 f90", 2017);
        motorcycle = new Motorcycle("Harley-Davidson", "Fat Bob", 2018);
    }

    // - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    // - проверка того, что объект Car создается с 4-мя колесами
    @Test
    public void testCarHaveFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // - проверка того, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotorcycleHaveTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    // - проверка того, что объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void testCarHaveSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // - проверка того, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void testMotorcycleHaveSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    // - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    public void testCarMayPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void testMotorcycleMayPark() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
