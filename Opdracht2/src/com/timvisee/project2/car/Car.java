package com.timvisee.project2.car;

public class Car {

    /**
     * Default car's brand.
     */
    public static final String DEFAULT_BRAND = "Tesla";

    /**
     * Default car's advice price.
     */
    public static final float DEFAULT_PRICE = 30000f;

    /**
     * Car brand.
     */
    private String brand;

    /**
     * Car's advice price.
     */
    private float price;

    /**
     * Constructor.
     *
     * @param brand Car brand.
     * @param price Car's advice price.
     */
    public Car(String brand, float price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * Constructor.
     * The default price of the car will be used.
     *
     * @param brand Car brand.
     */
    public Car(String brand) {
        this(brand, DEFAULT_PRICE);
    }

    /**
     * Constructor.
     * The default car brand will be used.
     *
     * @param price Car's advice price.
     */
    public Car(float price) {
        this(DEFAULT_BRAND, price);
    }

    /**
     * Get the car brand.
     *
     * @return Car brand.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Set the car brand.
     *
     * @param brand Car brand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get the car's advice price.
     *
     * @return Car's advice price.
     */
    public float getPrice() {
        return this.price;
    }

    /**
     * Set the car's advice price.
     *
     * @param price Car's advice price.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car[" + this.brand + ", " + this.price + "]";
    }
}
