package com.timvisee.project1.shipmentcost;

public class ShipmentCostManager {

    /**
     * Array with predefined shipment costs.
     */
    public static final float[][] SHIPMENT_COSTS = {
        {2.34f, 5.89f,  8.89f},
        {4.87f, 9.91f,  11.78f},
        {4.87f, 9.91f,  13.54f},
        {5.12f, 10.78f, 18.89f},
        {5.12f, 15.34f, 16.70f}
    };

    /**
     * Get the package costs for the given region.
     *
     * @param regionId Region ID.
     *
     * @return Package costs.
     */
    public static float[] getPackageCosts(int regionId) {
        return SHIPMENT_COSTS[regionId];
    }

    /**
     * Retrieve the number of regions.
     *
     * @return Number of regions.
     */
    public static int getRegionCount() {
        return SHIPMENT_COSTS.length;
    }

    /**
     * Get a list of region names.
     *
     * @return Region names.
     */
    public static String[] getRegionNames() {
        // Create a string array to put the region names in
        String[] regionNames = new String[getRegionCount()];

        // Put the region names into the array
        for(int i = 0; i < regionNames.length; i++)
            regionNames[i] = "Region " + (i + 1);

        // Return the list of region names
        return regionNames;
    }

    /**
     * Parse the region ID from a given string.
     *
     * @param regionString Region string.
     *
     * @return Region ID.
     */
    public static int parseRegionId(String regionString) {
        // Lowercase and trim the string
        regionString = regionString.toLowerCase().trim();

        // Make sure the string has a value
        if(regionString.length() == 0)
            return -1;

        // Remove the 'Region' string if available
        if(regionString.startsWith("region"))
            regionString = regionString.substring("region".length()).trim();

        // Try to parse the value
        try {
            return Integer.valueOf(regionString);

        } catch(Exception e) {
            // Unknown region, thus return the fallback region
            return -1;
        }
    }

    /**
     * Find the most expensive shipment cost value.
     *
     * @return Most expensive shipment cost.
     */
    public static float getMostExpensive() {
        // Define a variable with the most expensive value
        float mostExpensive = 0f;

        // Loop through the shipment costs to find the most expensive value
        for(float[] region : ShipmentCostManager.SHIPMENT_COSTS)
            for(float value : region)
                mostExpensive = Math.max(mostExpensive, value);

        // Return the most expensive value
        return mostExpensive;
    }
}
