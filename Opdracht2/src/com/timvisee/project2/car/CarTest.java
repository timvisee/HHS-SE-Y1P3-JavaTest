package com.timvisee.project2.car;

import static org.junit.Assert.*;

public class CarTest {

    @org.junit.Test
    public void testConstructor() throws Exception {
        // Predefine a brand and a price
        final String BRAND = "MyBrand";
        final float PRICE = 12345f;

        // Create a car with the given values
        Car car = new Car(BRAND, PRICE);

        // Assert the properties
        assertEquals(car.getBrand(), BRAND);
        assertTrue(car.getPrice() == PRICE);
    }

    @org.junit.Test
    public void testPriceConstructor() throws Exception {
        // Predefine a price
        final float PRICE = 54321;

        // Create a car with the given values
        Car car = new Car(PRICE);

        // Assert the properties
        assertEquals(car.getBrand(), Car.DEFAULT_BRAND);
        assertTrue(car.getPrice() == PRICE);
    }

    @org.junit.Test
    public void testBrandConstructor() throws Exception {
        // Predefine a brand
        final String BRAND = "MyOtherBrand";

        // Create a car with the given values
        Car car = new Car(BRAND);

        // Assert the properties
        assertEquals(car.getBrand(), BRAND);
        assertTrue(car.getPrice() == Car.DEFAULT_PRICE);
    }
}