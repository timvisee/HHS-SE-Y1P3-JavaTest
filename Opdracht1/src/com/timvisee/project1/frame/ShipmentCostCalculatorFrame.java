package com.timvisee.project1.frame;

import com.timvisee.project1.shipmentcost.ShipmentCostCalculator;
import com.timvisee.project1.shipmentcost.ShipmentCostManager;

import javax.swing.*;
import java.awt.*;

public class ShipmentCostCalculatorFrame extends JFrame {

    /**
     * Frame title.
     */
    public static final String FRAME_TITLE = "Shipment cost calculator";

    /**
     * Combo box for region selection.
     */
    private JComboBox regionComboBox;

    /**
     * Tet field for product count.
     */
    private JTextField productCountField;

    /**
     * Button to calculate.
     */
    private JButton calculateButton;

    /**
     * Constructor.
     *
     * @throws HeadlessException
     */
    public ShipmentCostCalculatorFrame() throws HeadlessException {
        // Construct the super
        super(FRAME_TITLE);

        // Build the frame UI
        buildUi();

        // Pack the frame
        pack();

        // Set the position of the frame and show it
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Build the UI components of the frame.
     */
    private void buildUi() {
        // Set the frame layout
        setLayout(new GridLayout(4, 1, 8, 8));

        // Set the border of the frame
        getRootPane().setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        // Create a label and add it to the frame
        add(new JLabel("Calculate shipment costs:"));

        // Create a text field for the user to put the number of products in
        add(productCountField = new JTextField("1"));

        // Create and configure a combo box for region selection
        //noinspection unchecked
        add(this.regionComboBox = new JComboBox(ShipmentCostManager.getRegionNames()));
        this.regionComboBox.setEditable(true);
        this.regionComboBox.setSelectedItem("Select a region");

        // Calculate the shipment cost when a value is selected
        this.regionComboBox.addActionListener(e -> calculateCosts());

        // Button to calculate the shipment cost
        add(this.calculateButton = new JButton("Calculate"));

        // Create an action listener for the button to calculate the shipment cost
        this.calculateButton.addActionListener(e -> calculateCosts());
    }

    /**
     * Calculate the cost of the shipment with the entered values.
     */
    public void calculateCosts() {
        // Define a variable for the product count
        int productCount;

        // Parse the product count
        try {
            productCount = Integer.parseInt(this.productCountField.getText());

        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid number of products!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Determine the region
        final int regionId = ShipmentCostManager.parseRegionId(this.regionComboBox.getSelectedItem().toString());

        try {
            // Calculate the shipment cost
            final float shipmentCost = new ShipmentCostCalculator(productCount, regionId).calculateCosts();

            // Calculate the shipment cost and show the result
            JOptionPane.showMessageDialog(
                    this,
                    "Shipment cost for order: " + shipmentCost, "Shipment cost",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception e) {
            // Show a proper error message
            JOptionPane.showMessageDialog(
                    this,
                    "Unable to calculate shipment cost. Invalid number of products.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
