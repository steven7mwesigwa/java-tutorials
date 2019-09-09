package com.stevenmwesigwa.allargsconstructor.demo4;

import lombok.AllArgsConstructor;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@AllArgsConstructor(staticName = "of")
public class Person {

    private String firstname;
    private String lastname;
    private final String ssn;

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", ssn=" + ssn + '}';
    }

}
