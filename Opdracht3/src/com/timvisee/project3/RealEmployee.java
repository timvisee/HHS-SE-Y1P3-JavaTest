package com.timvisee.project3;

import java.util.Objects;

public class RealEmployee extends Employee {

    /**
     * Get the section this employee is working in.
     */
    private String section;

    /**
     * Get the salary of the employee on a monthly basis.
     */
    private double monthSalary;

    /**
     * Constructor.
     *
     * @param section Section this employee is working in.
     * @param monthSalary Monthly salary of this employee.
     */
    public RealEmployee(String section, double monthSalary) {
        this.section = section;
        this.monthSalary = monthSalary;
    }

    /**
     * Get the section this employee is working in.
     *
     * @return Section.
     */
    public String getSection() {
        return this.section;
    }

    /**
     * Set the section this employee is working in.
     *
     * @param section Section.
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * Get the salary of this employee on a monthly basis.
     *
     * @return Monthly salary.
     */
    public double getMonthSalary() {
        return this.monthSalary;
    }

    /**
     * Set the salary of this employee on a monthly basis.
     *
     * @param monthSalary Monthly salary.
     */
    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public double makeMoney() {
        return this.monthSalary;
    }

    /**
     * Give this employee some storage depending on the section he or she is working in.
     *
     * @param subEmployees Number of sub employees.
     *
     * @return Extra salary factor.
     */
    public double giveExtraSalary(int subEmployees) {
        // If this is just a real employee
        if(subEmployees == 0 && Objects.equals(this.getClass().getSimpleName(), RealEmployee.class.getSimpleName()))
            return getSection().equalsIgnoreCase("cleaning") ? 1.05 : 1.07;
        else if(subEmployees == 1 || subEmployees == 2)
            return 1.08;
        else if(subEmployees > 2)
            return Math.max(subEmployees * 1.03, 1.15);

        // Return the default
        return 1;
    }
}
