package com.stevenmwesigwa.allargsconstructor.demo5;

import lombok.AllArgsConstructor;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@AllArgsConstructor
public class Person {

    private String firstname;
    private String lastname;
    private String ssn;

    /**
     *
     * @param firstname
     * @param lastname
     */
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", ssn=" + ssn + '}';
    }

}
