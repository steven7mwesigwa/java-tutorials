package com.stevenmwesigwa.nonnull.demo1;

import lombok.NonNull;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Person {

    private String firstname;
    private String lastname;
    private String ssn;

    /**
     *
     * @param firstname
     * @param lastname
     * @param ssn
     */
    public Person(String firstname, String lastname, @NonNull String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", ssn=" + ssn + '}';
    }

}
