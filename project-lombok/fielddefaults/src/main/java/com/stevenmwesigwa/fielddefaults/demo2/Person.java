package com.stevenmwesigwa.fielddefaults.demo2;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    String firstname;
    String lastname;

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
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }

}
