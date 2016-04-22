package com.timvisee.project2.car;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarCollectionTest {

    @Test
    public void addCar() throws Exception {
        // Create a car collection
        CarCollection carCollection = new CarCollection();

        // Predefine a brand and a price
        final String BRAND = "MyBrand";
        final float PRICE = 12345f;

        // Add a car to the collection
        carCollection.addCar(BRAND, PRICE);

        // Assert the properties
        assertEquals(carCollection.getCollection().get(0).getBrand(), BRAND);
        assertTrue(carCollection.getCollection().get(0).getPrice() == PRICE);
    }

    @Test
    public void addCarByBrand() throws Exception {
        // Create a car collection
        CarCollection carCollection = new CarCollection();

        // Predefine a brand
        final String BRAND = "MyBrand";

        // Add a car to the collection
        carCollection.addCar(BRAND);

        // Assert the properties
        assertEquals(carCollection.getCollection().get(0).getBrand(), BRAND);
        assertTrue(carCollection.getCollection().get(0).getPrice() == Car.DEFAULT_PRICE);
    }

    @Test
    public void addCarByPrice() throws Exception {
        // Create a car collection
        CarCollection carCollection = new CarCollection();

        // Predefine a price
        final float PRICE = 12345f;

        // Add a car to the collection
        carCollection.addCar(PRICE);

        // Assert the properties
        assertEquals(carCollection.getCollection().get(0).getBrand(), Car.DEFAULT_BRAND);
        assertTrue(carCollection.getCollection().get(0).getPrice() == PRICE);
    }
}