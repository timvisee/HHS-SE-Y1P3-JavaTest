package com.timvisee.project2.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarCollection {

    /**
     * Collection of cars.
     */
    private List<Car> collection = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CarCollection() { }

    /**
     * Add a car to the collection.
     *
     * @param car Car to add.
     */
    public void addCar(Car car) {
        this.collection.add(car);
    }

    /**
     * Add a car with the given values.
     *
     * @param brand Car brand.
     * @param price Car price.
     */
    public void addCar(String brand, float price) {
        addCar(new Car(brand, price));
    }

    /**
     * Add a car with the given price.
     * The default brand will be used.
     *
     * @param price Car price.
     */
    public void addCar(float price) {
        addCar(new Car(price));
    }

    /**
     * Add a car with the given brand.
     * The default price will be used.
     *
     * @param brand Car brand.
     */
    public void addCar(String brand) {
        addCar(new Car(brand));
    }

    /**
     * Get the list of cars in the collection.
     *
     * @return Car collection.
     */
    public List<Car> getCollection() {
        return Collections.unmodifiableList(this.collection);
    }

    /**
     * Clear the collection of cars.
     */
    public void clear() {
        this.collection.clear();
    }

    /**
     * Print the list of cars in this collection to the console.
     */
    public void printCollection() {
        // Print the number of cars
        System.out.println("There are " + this.collection.size() + " cars in this collection:");

        // Print each car
        for(Car car : this.collection)
            System.out.println(" - " + car);
    }
}
