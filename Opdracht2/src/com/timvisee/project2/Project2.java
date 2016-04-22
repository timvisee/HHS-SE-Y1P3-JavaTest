package com.timvisee.project2;

import com.timvisee.project2.car.Car;
import com.timvisee.project2.car.CarCollection;

public class Project2 {

    /**
     * Main method, called on start.
     *
     * @param args Start up arguments.
     */
    public static void main(String[] args) {
        // Create a collection of cars
        CarCollection carCollection = new CarCollection();

        // Add some cars
        carCollection.addCar(new Car("CarBrand", 12345f));
        carCollection.addCar(new Car(54321));
        carCollection.addCar(new Car("OtherCarBrand"));

        // Print the list of cars
        carCollection.printCollection();
    }
}
