package com.stevenmwesigwa.tostring.demo3;

import lombok.ToString;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@ToString(includeFieldNames=false)
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