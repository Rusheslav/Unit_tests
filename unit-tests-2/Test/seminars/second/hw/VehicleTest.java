package seminars.second.hw;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle moto;

    @BeforeEach
    void setUp() {
        car = new Car("Mercedez", "A300", 2021);
        moto = new Motorcycle("Harley", "Eagle", 2020);
    }

    @Test
    void carIsInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carHasFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasTwoWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carGetsToSpeedSixtyDuringTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleGetsToSpeedSeventyFiveDuringTestDrive() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    @Test
    void carStopsAfterTestDriveAndPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleStopsAfterTestDriveAndPark() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}