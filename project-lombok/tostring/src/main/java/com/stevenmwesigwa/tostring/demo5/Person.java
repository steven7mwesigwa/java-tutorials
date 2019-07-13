package com.stevenmwesigwa.tostring.demo5;

import lombok.ToString;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@ToString(doNotUseGetters = true)
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

    /**
     *
     * @return firstname
     */
    public String getFirstname() {
        return "FIRST: " + firstname;
    }

    /**
     *
     * @return lastname
     */
    public String getLastname() {
        return "LAST: " + lastname;
    }

}
