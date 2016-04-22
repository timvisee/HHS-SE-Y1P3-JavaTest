package com.timvisee.project3;

public abstract class Employee {

    /**
     * Name of the employee.
     */
    private String name;

    /**
     * Number of years of experience this employee has.
     */
    private int yearsExperience;

    /**
     * Make some money! Yay.
     *
     * @return Earned money.
     */
    public abstract double makeMoney();

    /**
     * Get the name of the employee.
     *
     * @return Employee name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name of the employee.
     *
     * @param name Employee name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the number of years of experience of this employee.
     *
     * @return Number of years of experience.
     */
    public int getYearsExperience() {
        return this.yearsExperience;
    }

    /**
     * Set the number of years of experience of this employee.
     *
     * @param yearsExperience Number of years of experience.
     */
    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
