package com.stevenmwesigwa.tostring.demo1;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
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

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }
}
