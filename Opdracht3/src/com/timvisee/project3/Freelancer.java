package com.timvisee.project3;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends RealEmployee {

    /**
     * Base salary on a hourly basis.
     */
    private double baseSalary;

    /**
     * Specialities of this freelancer.
     */
    private List<String> specialities = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param section Section this employee is working in.
     * @param monthSalary Monthly salary of this employee.
     * @param baseSalary Base salary, on a hourly basis.
     * @param specialities Specialities of this freelancer.
     */
    public Freelancer(String section, double monthSalary, double baseSalary, List<String> specialities) {
        // Construct the super
        super(section, monthSalary);

        // Set the fields
        this.baseSalary = baseSalary;
        this.specialities = specialities;
    }

    /**
     * Get the base salary on a hourly basis.
     *
     * @return Base salary.
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    /**
     * Set the base salary on a hourly basis.
     * @param baseSalary
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Get the specialities of this freelancer.
     *
     * @return Specialities.
     */
    public List<String> getSpecialities() {
        return this.specialities;
    }

    /**
     * Add a speciality to this freelancer.
     *
     * @param speciality Speciality.
     */
    public void setSpecialities(String speciality) {
        this.specialities.add(speciality);
    }

    @Override
    public double makeMoney() {
        return this.baseSalary;
    }
}
