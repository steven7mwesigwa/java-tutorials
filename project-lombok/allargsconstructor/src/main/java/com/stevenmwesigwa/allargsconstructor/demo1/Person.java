package com.stevenmwesigwa.allargsconstructor.demo1;

import lombok.AllArgsConstructor;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@AllArgsConstructor
public class Person {

    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }
}
