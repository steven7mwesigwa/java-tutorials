package com.stevenmwesigwa.gettersetter.demo1;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Person {

    private String firstname;
    private String lastname;

    /**
     *
     * @return firstname
     */
    public String getFirstName() {
        return firstname;
    }

    /**
     *
     * @return lastname
     */
    public String getLastName() {
        return lastname;
    }

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
