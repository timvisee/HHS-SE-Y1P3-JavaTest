package com.timvisee.project3;

public class Stagiare extends RealEmployee {

    /**
     * Name of the school.
     */
    private String schoolName;

    /**
     * The stage funds the stagiare gets.
     */
    private double stageFunds;

    /**
     * Mail address.
     *
     * @type
     */
    private String mail;

    /**
     * Constructor.
     *
     * @param section Section this employee is working in.
     * @param monthSalary Monthly salary of this employee.
     * @param schoolName School name.
     * @param stageFunds Stage funds.
     */
    public Stagiare(String section, double monthSalary, String schoolName, double stageFunds) {
        // Construct the super
        super(section, monthSalary);

        // Set the fields
        this.schoolName = schoolName;
        this.stageFunds = stageFunds;
    }

    /**
     * Get the name of the school.
     *
     * @return School name.
     */
    public String getSchoolName() {
        return this.schoolName;
    }

    /**
     * Set the name of the school.
     *
     * @param schoolName School name.
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Get the stage funds the stagiare gets.
     *
     * @return Stage funds.
     */
    public double getStageFunds() {
        return this.stageFunds;
    }

    /**
     * Set the stage funds the stagiare gets.
     *
     * @param stageFunds Stage funds.
     */
    public void setStageFunds(double stageFunds) {
        this.stageFunds = stageFunds;
    }

    /**
     * Get the mail address.
     *
     * @return Mail address.
     */
    public String getMail() {
        return this.mail;
    }

    /**
     * Set the mail address.
     *
     * @param mail Mail address.
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Check whether the employee has a mail address configured.
     *
     * @return True if configured, false if not.
     */
    public boolean hasMail() {
        return this.mail != null;
    }

    @Override
    public double makeMoney() {
        return this.stageFunds;
    }
}
