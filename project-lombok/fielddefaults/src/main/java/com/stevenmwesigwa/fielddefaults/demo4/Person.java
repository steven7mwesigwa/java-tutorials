package com.stevenmwesigwa.fielddefaults.demo4;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Person {

    String firstname;
    String lastname;
    @NonFinal
    String email;

    /**
     *
     * @param firstname
     * @param lastname
     * @param email
     */
    public Person(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + '}';
    }

}
