package com.timvisee.project3;

import java.util.Collections;

public class Project3 {

    /**
     * Main method called on star.t
     *
     * @param args Start arguments.
     */
    public static void main(String[] args) {


        /*
         * Deze opdracht is erg onduidelijk wat betreft het gewnste ontwerp van de applicatie.
         * Bovendien komt het bijgevoegde diagram niet overeen met de gevraagde structuur.
         * In opdract C gaat het ineens over het aantal ondergeschikten. Op welke manier wordt dat gedefinieerd?
         * Voor nu geef ik het aantal ondergeshikten mee als parameter.
         */


        // Create an instance of the stagiare
        Stagiare stagiare = new Stagiare("MySection", 123, "MySchool", 123);

        // Create an instance of the freelancer
        Freelancer freelancer = new Freelancer("MySection", 123, 123, Collections.singletonList("MySpeciality"));

        // Create an instance of the real employee
        RealEmployee realEmployee = new RealEmployee("MySection", 123);
    }
}
