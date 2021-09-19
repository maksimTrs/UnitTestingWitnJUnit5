package tests;

import com.company.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    public void createCarTestData() {
        car = new Car("Skoda", "ABC-123", 2019, "Maksim T." );
    }

    @Test
    void getCarBrand() {
        assertEquals("Skoda", car.getCarBrand(), "Method getCarBrand() has a different value!");
    }

    @Test
    void getCarNumber() {
        assertEquals("ABC-123", car.getCarNumber(), "Method getCarNumber() has a different value!");
    }

    @Test
    void setCarNumber() {
        car.setCarNumber("AAA-111");
        assertEquals("AAA-111", car.getCarNumber(),"Method setCarNumber() has a different value!");
    }

    @Test
    void getCarCreationYear() {
        assertEquals(2019, car.getCarCreationYear(), "Method getCarCreationYear() has a different value!");
    }

    @Test
    void getCarOwner() {
        assertEquals("Maksim T.", car.getCarOwner(), "Method getCarOwner() has a different value!");
    }

    @Test
    void setCarOwner() {
        car.setCarOwner("Maksim Tarasov");
        assertEquals("Maksim Tarasov", car.getCarOwner(),"Method setCarOwner() has a different value!");
    }

    @Test
    void getListOfOneOwners() {
        assertArrayEquals(new String[]{"Maksim T."}, car.getOwners().toArray());
    }

    @Test
    void getListOfTwoOwners() {
        car.setCarOwner("Maksim Tarasov2");
        assertArrayEquals(new String[]{"Maksim T.", "Maksim Tarasov2"}, car.getOwners().toArray());
    }
}