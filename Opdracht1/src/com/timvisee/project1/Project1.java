package com.timvisee.project1;

import com.timvisee.project1.shipmentcost.ShipmentCostCalculator;
import com.timvisee.project1.shipmentcost.ShipmentCostManager;
import com.timvisee.project1.frame.ShipmentCostCalculatorFrame;

import java.util.Scanner;

public class Project1 {

    /**
     * The threshold the cost should increase at.
     */
    public static final float COST_INCREASE_THRESHOLD = 13.54f;

    /**
     * The factor the cost should be increased with.
     */
    public static final float COST_INCREASE_FACTOR = 1.15f;

    /**
     * Main method, called on start.
     *
     * @param args Start up arguments.
     */
    public static void main(String[] args) {
        // Create a scanner for console input
        Scanner in = new Scanner(System.in);

        // Create the frame
        new ShipmentCostCalculatorFrame();

        // Loop through the shipment costs matrix
        for(float[] region : ShipmentCostManager.SHIPMENT_COSTS) {
            for(float value : region) {
                // Make sure the value is higher than the threshold
                if (value <= COST_INCREASE_THRESHOLD)
                    continue;

                // Print the value with the addition of 15 percent
                System.out.println(value * COST_INCREASE_FACTOR);

                // TODO: Store the new value in the array? Unclear.
            }
        }

        // Print some empty lines
        System.out.println("\n\n");

        // Ask for the number of products
        System.out.print("Calculate shipment costs!\nProduct count: ");
        int productCount = in.nextInt();

        // Ask for the users region
        System.out.print("Region number: Region ");
        int regionId = in.nextInt() - 1;

        // Do this in a try-catch block to ensure safety
        try {
            // Initialize a shipment calculator to calculate the cost of the given shipment
            ShipmentCostCalculator shipment = new ShipmentCostCalculator(productCount, regionId);

            // Calculate the shipment cost and print the result
            System.out.println("Shipment cost: " + shipment.calculateCosts());

        } catch (Exception e) {
            // Print a fancy error message
            System.out.println(e.getMessage());
        }
    }
}
