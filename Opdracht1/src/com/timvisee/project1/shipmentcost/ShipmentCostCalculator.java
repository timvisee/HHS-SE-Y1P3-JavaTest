package com.timvisee.project1.shipmentcost;

public class ShipmentCostCalculator {

    /**
     * Region ID of this shipment.
     */
    private int regionId;

    /**
     * Product count.
     */
    private int productCount;

    /**
     * Constructor.
     *
     * @param productCount Number of packages.
     * @param regionId Region ID.
     *
     * @throws Exception
     */
    public ShipmentCostCalculator(int productCount, int regionId) throws Exception {
        // Set the fields through the private setters to evaluate the values
        setRegionId(regionId);
        setProductCount(productCount);
    }

    /**
     * Get the region ID.
     *
     * @return Region ID.
     */
    public int getRegionId() {
        return this.regionId;
    }

    /**
     * Set the region ID of this shipment.
     *
     * @param regionId Region ID.
     */
    private void setRegionId(int regionId) {
        // Evaluate the value, if the region is unknown set it's value to -1
        if(regionId < 0 || regionId >= ShipmentCostManager.getRegionCount() - 1) {
            this.regionId = -1;
            return;
        }

        // Set the field
        this.regionId = regionId;
    }

    /**
     * Get the package count.
     *
     * @return Package count.
     */
    public int getProductCount() {
        return this.productCount;
    }

    /**
     * Set the number of packages in this shipment.
     *
     * @param productCount Package count.
     *
     * @throws Exception
     */
    private void setProductCount(int productCount) throws Exception {
        // Evaluate the value
        if(productCount <= 0)
            throw new Exception("Invalid package count.");

        // Set the field
        this.productCount = productCount;
    }

    /**
     * Calculate the shipment costs of the package.
     *
     * @return Shipment costs.
     */
    public float calculateCosts() {
        // If the region is set to -1, return the most expensive shipment cost
        if(this.regionId == -1)
            return ShipmentCostManager.getMostExpensive();

        // Get the package specific costs for the current region
        final float[] PACKAGE_COSTS = ShipmentCostManager.getPackageCosts(this.regionId);

        // TODO: Use constants here!

        // Determine the shipment method index
        final int methodIndex = (this.productCount > 1 ? 1 : 0) + (this.productCount > 3 ? 1 : 0);

        // Fetch and return the shipment cost
        return PACKAGE_COSTS[methodIndex];
    }
}
