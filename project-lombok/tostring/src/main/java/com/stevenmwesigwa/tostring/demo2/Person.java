package com.stevenmwesigwa.tostring.demo2;

import lombok.ToString;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@ToString
public class Person {

    private String firstname;
    private String lastname;

    /**
     *
     * @param firstname
     */
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    /**
     *
     * @param lastname
     */
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
}
